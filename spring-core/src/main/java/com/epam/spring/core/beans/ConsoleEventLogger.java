package com.epam.spring.core.beans;

/**
 * Created by Dzmitry_Hryhoryeu on 2/17/2016.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event) {
        System.out.println("Log message: " + event.toString());
    }

}
