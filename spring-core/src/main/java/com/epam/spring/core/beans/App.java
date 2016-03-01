package com.epam.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    private Client client;
    private EventLogger consoleEventLogger;

    public App() {
    }

    public App(Client client, EventLogger consoleEventLogger) {
        this.client = client;
        this.consoleEventLogger = consoleEventLogger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");
    }


    public void logEvent (String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        consoleEventLogger.logEvent(message);
    }

}
