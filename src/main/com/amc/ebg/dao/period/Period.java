package com.amc.ebg.dao.period;


import java.io.Serializable;
import java.util.Date;

import org.joda.time.DateTime;

import com.amc.ebg.domain.types.PeriodType;

/**
 * @author Timoteo Ponce
 */
public class Period implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1769772790289381162L;

    private Date lowerDate;

    private Long lowerTime;

    private Date higherDate;

    private Long higherTime;

    private PeriodType periodType;

    public Long getLowerTime() {
        return lowerTime;
    }

    public void setLowerTime(final Long lowerTime) {
        this.lowerTime = lowerTime;
        if (lowerTime != null) {
            setLowerDate(new Date(lowerTime));
        }
    }

    public Long getHigherTime() {
        return higherTime;
    }

    public void setHigherTime(final Long higherTime) {
        this.higherTime = higherTime;
        if (higherTime != null) {
            setHigherDate(new Date(higherTime));
        }
    }

    public Date getLowerDate() {
        return lowerDate;
    }

    public void setLowerDate(final Date lowerDate) {
        this.lowerDate = lowerDate;
    }

    public Date getHigherDate() {
        return higherDate;
    }

    public void setHigherDate(final Date higherDate) {
        this.higherDate = higherDate;
    }

    public PeriodType getPeriodType() {
        return periodType;
    }

    public void setPeriodType(final PeriodType periodType) {
        this.periodType = periodType;
    }

    public void clear() {
        setHigherDate(null);
        setHigherTime(null);
        setLowerDate(null);
        setLowerTime(null);
        setPeriodType(null);
    }

    public Date getFixedLowerDate() {
        if (getLowerDate() != null) {
            return new DateTime(getLowerDate()).withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0).toDate();
        }
        return null;
    }

    public Date getFixedHigherDate() {
        if (getHigherDate() != null) {
            return new DateTime(getHigherDate()).withHourOfDay(23).withMinuteOfHour(59).withSecondOfMinute(59).toDate();
        }
        return null;
    }

}
