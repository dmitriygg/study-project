package com.epam.spring.core.beans;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by Dzmitry_Hryhoryeu on 3/5/2016.
 */
public class CombinedEventLogger implements EventLogger {

    Collection<EventLogger> eventLoggers;

    public CombinedEventLogger() {
    }

    public CombinedEventLogger(Collection<EventLogger> eventLoggers) {
        this.eventLoggers = eventLoggers;
    }


    public void logEvent(Event event) {

    }


}
