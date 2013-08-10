package com.amc.ebg.notification.mail;

import ch.swissbytes.commons.io.ResourceLocator;
import ch.swissbytes.commons.io.StreamBlock;

import javax.activation.DataSource;
import javax.activation.URLDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import org.slf4j.LoggerFactory;

import com.amc.ebg.properties.Configuration;
import com.amc.ebg.properties.ConfigurationKey;
import com.amc.ebg.properties.PropertiesConfiguration;
import com.amc.validator.EmailValidator;

/**
 * @author Timoteo Ponce
 */
public abstract class NotificationMailSender<Source> {

    private static final String DATE_PATTERN = "dd.MM.yyyy HH:mm:ss";

    static final String TEMPLATES_FOLDER = "templates/";

    private static final Map<String, Properties> MESSAGES = new HashMap<String, Properties>();

    private final Configuration configuration;

    private final HtmlEmail email;

    private Source source;

    private String locale;

    public NotificationMailSender(final Configuration configuration, final HtmlEmail email) {
        this.configuration = configuration;
        this.email = email;
    }

    public final void sendMail(final Source source) throws EmailException {
        this.source = source;
        final boolean notificationsEnabled = configuration.getBoolean(ConfigurationKey.MAIL_ENABLESENDING);
        if (notificationsEnabled && isAValidAddress(getReceiverEmail())) {
            String[] locales = configuration.getArray(ConfigurationKey.MAIL_SUPPORTEDLOCALES);
            for (String locale : locales) {
                this.locale = locale.toLowerCase();
                fillSmtpData(email);
                fillContentData(email);
                embedImages(email);
                email.send();
                LoggerFactory.getLogger(getClass()).info(getSubject() + " mail [ " + locale + " ] sent to : " + getReceiverEmail());
            }
        }
    }

    protected Source getSource() {
        return source;
    }

    protected Properties getMessages() {
        return getMessages(locale);
    }

    protected void embedImages(final HtmlEmail email) throws EmailException {
    }

    protected void embedImage(final HtmlEmail email, final String path, final String name) throws EmailException {
        final DataSource dataSource = new URLDataSource(Thread.currentThread().getContextClassLoader().getResource(path));
        email.embed(dataSource, name, name);
    }

    protected final void replaceVar(final StringBuilder buffer, final String var, final String value) {
        int index = buffer.indexOf(var);
        while (index > -1) {
            buffer.replace(index, index + var.length(), value);
            index = buffer.indexOf(var);
        }
    }

    protected String getFormattedDate(final Date date) {
        return DateFormatUtils.format(date, DATE_PATTERN);
    }

    protected String getFormattedPeriod(final Period period) {
        final PeriodFormatter formatter =
            new PeriodFormatterBuilder().appendDays().appendSuffix("d").appendSeparator(" ").appendHours().appendSuffix("h").appendSeparator(" ").appendMinutes().appendSuffix("m")
                .appendSeparator(" ").appendSeconds().appendSuffix("s").appendSeparator(" ").toFormatter();
        return formatter.print(period);
    }

    abstract protected String getReceiverEmail();

    abstract protected void replaceVars(StringBuilder buffer);

    abstract protected String getTemplateFile();

    abstract protected String getSubject();

    private static Properties getMessages(final String locale) {
        if (!MESSAGES.containsKey(locale)) {
            MESSAGES.put(locale, PropertiesConfiguration.loadProperties("messages_" + locale + ".properties"));
        }
        return MESSAGES.get(locale);
    }

    private boolean isAValidAddress(final String receiverEmail) {
        return EmailValidator.isAValidAddress(receiverEmail);
    }

    private void fillContentData(final HtmlEmail email) throws EmailException {
        final StringBuilder buffer = readMailTemplate();
        replaceVars(buffer);
        email.setHtmlMsg(buffer.toString());
    }

    private StringBuilder readMailTemplate() throws EmailException {
        try {
            final StringBuilder buffer = new StringBuilder();
            final String template = TEMPLATES_FOLDER + getTemplateFile() + "_" + locale + ".html";
            InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(template);
            // do not remove,somehow the previous code fails when unit testing
            if (stream == null) {
                stream = ResourceLocator.getResourceAsStream(template);
            }
            ResourceLocator.inspectStream(stream, new StreamBlock() {
                @Override
                public void process(final InputStream inputStream) throws IOException {
                    final String htmlContent = IOUtils.toString(inputStream);
                    buffer.append(htmlContent);
                }
            });
            return buffer;
        } catch (final IOException e) {
            throw new EmailException(e);
        }
    }

    private void fillSmtpData(final Email email) throws EmailException {
        email.setHostName(configuration.getString(ConfigurationKey.SMTP_SERVER));
        email.setFrom(configuration.getString(ConfigurationKey.SMTP_SENDER_ADDRESS));
        email.setSubject(getSubject());
        email.setAuthentication(configuration.getString(ConfigurationKey.SMTP_USERNAME), configuration.getString(ConfigurationKey.SMTP_PASSWORD));
        email.setSmtpPort(configuration.getInt(ConfigurationKey.SMTP_PORT));
        email.getToAddresses().clear();
        email.addTo(getReceiverEmail());
    }

}
