package com.amc.validator;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.jboss.seam.annotations.Install;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.faces.Validator;
import org.jboss.seam.annotations.intercept.BypassInterceptors;
import org.jboss.seam.international.Messages;

/**
 * The EmailValidator class validates the proper email format.
 * 
 * @author rory
 */
@Name("emailValidator")
@BypassInterceptors
@Install(precedence = 0, classDependencies = { "javax.faces.context.FacesContext" })
@Validator(id = "emailValidator")
public class EmailValidator extends BaseValidator {

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[_A-Za-z0-9-]{2,}+)$";

    private static final Pattern MASK = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    public EmailValidator() {
        super(Messages.instance());
    }

    public EmailValidator(final Map<String, String> messages) {
        super(messages);
    }

    /**
     * Email Validation, takes place using a well known EMAIL PATTERN
     */
    @Override
    public void validate(final FacesContext facesContext, final UIComponent uiComponent, final Object value) throws ValidatorException {
        checkRequired(value);
        final String inputValue = (String) value;
        if (!EmailValidator.isAValidAddress(inputValue)) {
            throwException("validator.emailValidator.format", "validator.emailValidator.formatDetail");
        }
    }

    /**
     * @param emailAddress
     * @return
     * @author Timoteo Ponce
     */
    public static boolean isAValidAddress(final String emailAddress) {
        final Matcher matcher = MASK.matcher(emailAddress);
        return matcher.matches();
    }

}
