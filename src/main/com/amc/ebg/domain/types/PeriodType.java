package com.amc.ebg.domain.types;

import java.util.EnumSet;

/**
 * @author Timoteo Ponce
 */
public enum PeriodType {
    PUBLICATION, EXPIRATION, EVENT, REGISTRATION, MODIFICATION;

    public static final EnumSet<PeriodType> COMMON_PERIODS = EnumSet.of(REGISTRATION, EXPIRATION);

    public static final EnumSet<PeriodType> ACCOUNT_PERIODS = EnumSet.of(REGISTRATION, MODIFICATION);

    public static final EnumSet<PeriodType> FLYER_PERIODS = EnumSet.of(PUBLICATION, EXPIRATION, EVENT);
}
