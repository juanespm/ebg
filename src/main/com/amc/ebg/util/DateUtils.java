package com.amc.ebg.util;


import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.LoggerFactory;

/**
 * Provides mechanism to manage proper dates for the system.
 *
 * @author rory
 */
public final class DateUtils {

    private DateUtils() {
    }

    /**
     * Returns a new XMLGregorianCalendar from a date value.
     *
     * @param date the date to set
     * @return the XMLGregorianCalendar
     * @throws DatatypeConfigurationException
     */
    public static XMLGregorianCalendar createXMLGregorianCalendar(final Date date) {
        XMLGregorianCalendar xgcal = null;
        try {
            final GregorianCalendar gcal = new GregorianCalendar();
            gcal.setTime(date);
            xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (final Exception e) {
            LoggerFactory.getLogger(DateUtils.class).warn("Caught Date->XML conversion : " + date);
        }
        return xgcal;
    }

    /**
     * @param dateString
     * @param pattern
     * @return
     * @author Timoteo Ponce
     */
    public static Date parseDate(final String dateString, final String pattern) {
        Date myDate = null;
        if (org.apache.commons.lang.StringUtils.isNotEmpty(dateString)) {
            try {
                myDate = org.apache.commons.lang.time.DateUtils.parseDate(dateString, new String[] { pattern });
            } catch (final ParseException e) {
                LoggerFactory.getLogger(DateUtils.class).warn("Invalid Date...! " + dateString + " with format " + pattern);
            }
        }
        return myDate;
    }

    public static String format(final Date date, final String dateFormat) {
        return date == null ? null : DateFormatUtils.format(date, dateFormat);
    }
}
