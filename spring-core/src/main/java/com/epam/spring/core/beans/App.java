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
        app.logEvent("Some event for user 1", (Event) ctx.getBean("event"));
        app.logEvent("Some event for user 2", (Event) ctx.getBean("event"));
    }

    public void logEvent (String msg, Event event) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        event.setMsg(message);
        consoleEventLogger.logEvent(event);
    }

}
