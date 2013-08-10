package com.amc.validator;

import javax.faces.application.FacesMessage;
import javax.faces.validator.ValidatorException;

import java.util.Map;

/**
 * 
 * @author Timoteo Ponce
 */
public abstract class BaseValidator implements javax.faces.validator.Validator {
    private final Map<String, String> messages;

    public BaseValidator(final Map<String, String> messages) {
        this.messages = messages;
    }

    protected void checkRequired(final Object value) {
        if (value == null) {
            throwRequiredException();
        }
    }

    protected void throwRequiredException() throws ValidatorException {
        throwException("javax.faces.component.UIInput.REQUIRED", "javax.faces.component.UIInput.REQUIRED");
    }

    protected void throwException(final String detailKey) throws ValidatorException {
        final FacesMessage message = new FacesMessage();
        message.setDetail(messages.get(detailKey));
        message.setSummary(messages.get(detailKey));
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
    }

    protected void throwException(final String detailKey, final String summaryKey) throws ValidatorException {
        final FacesMessage message = new FacesMessage();
        message.setDetail(messages.get(detailKey));
        message.setSummary(messages.get(summaryKey));
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
    }

}
