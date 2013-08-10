package com.amc.ebg.properties;

/**
 * @author Timoteo Ponce
 */
public enum ConfigurationKey {

    CRONJOB_CHECKFLYERSTATUS("cronjob.checkflyerstatus"), CHECKFLYERSTATUS_ENABLED("checkflyerstatus.enabled"), 
    MAIL_ENABLESENDING("mail.enablesending"), 
    SMTP_SERVER("smtp.server"), 
    SMTP_SENDER_ADDRESS("smtp.sender.address"),
    SMTP_USERNAME("smtp.username"), 
    SMTP_PASSWORD("smtp.password"), 
    SMTP_PORT("smtp.port"), 
    WEB_ROOT_URL("web.root.url"), 
    MAIL_SUPPORTEDLOCALES("mail.supportedlocales");

    private final String key;

    private ConfigurationKey(final String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
