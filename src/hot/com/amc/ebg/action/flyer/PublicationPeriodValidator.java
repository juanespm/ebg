package com.amc.ebg.action.flyer;

import javax.faces.application.FacesMessage;
import javax.faces.validator.ValidatorException;

import java.util.Date;
import java.util.Map;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * @author Timoteo Ponce
 */
@Name(PublicationPeriodValidator.NAME)
public class PublicationPeriodValidator {

    public static final String NAME = "publicationPeriodValidator";

    @In
    private Map<String, String> messages;

    public void validate(final Date publicationDate, final Date eventDate, final Date expirationDate) throws ValidatorException {
        if (publicationDate != null) {
            validatePublicationDate(publicationDate);
        }
        if (eventDate != null) {
            validateEventDate(publicationDate, eventDate);
        }
        if (expirationDate != null) {
            validateExpirationDate(publicationDate, eventDate, expirationDate);
        }
    }

    private void validateEventDate(final Date publicationDate, final Date eventDate) {
        if (publicationDate == null) {
            throwValidatorException(messages.get("validator.eventRequiresPublication"));
        }
        DateTime lowerDate = new DateTime(publicationDate);
        DateTime middleDate = new DateTime(eventDate);
        if (middleDate.isBefore(lowerDate)) {
            throwValidatorException(messages.get("validator.eventBeforePublication"));
        }
    }

    private void validateExpirationDate(final Date publicationDate, final Date eventDate, final Date expirationDate) {
        if (publicationDate == null) {
            throwValidatorException(messages.get("validator.expirationRequiresPublication"));
        }
        if (eventDate == null) {
            throwValidatorException(messages.get("validator.expirationRequiresEvent"));
        }
        DateTime lowerDate = new DateTime(publicationDate);
        DateTime middleDate = new DateTime(eventDate);
        DateTime higherDate = new DateTime(expirationDate);
        // publication-expiration
        if (higherDate.isBefore(lowerDate)) {
            throwValidatorException(messages.get("validator.expirationBeforePublication"));
        }
        if (Days.daysBetween(lowerDate, higherDate).size() < 1) {
            throwValidatorException(messages.get("validator.invalidPublicationPeriod"));
        }
        // eventDate-expiration
        if (higherDate.isBefore(middleDate)) {
            throwValidatorException(messages.get("validator.expirationBeforeEvent"));
        }
    }

    private void validatePublicationDate(final Date publicationDate) {
        DateTime lowerDate = new DateTime(publicationDate);
        if (lowerDate.isBeforeNow()) {
            throwValidatorException(messages.get("validator.publicationBeforeNow"));
        }
    }

    public static void throwValidatorException(final String content) {
        final FacesMessage message = new FacesMessage();
        message.setSummary(content);
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
    }
}
