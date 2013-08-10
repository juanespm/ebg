package com.amc.ebg.util;

import org.jboss.seam.async.TimerSchedule;
import org.jboss.seam.core.Events;
import org.joda.time.DateTime;

/**
 * @author Timoteo Ponce
 *
 */
public class EventUtils {

    /**
     * @param events
     * @param eventType
     * @param seconds delay in seconds
     * @param args
     * @author Timoteo Ponce
     */
    public static void raiseEvent(final Events events, final String eventType, final int seconds, final Object... args) {
        final TimerSchedule schedule = new TimerSchedule(new DateTime().plusSeconds(seconds).toDate());
        events.raiseTimedEvent(eventType, schedule, args);
    }

}
