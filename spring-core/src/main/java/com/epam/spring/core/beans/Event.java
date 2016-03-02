package com.epam.spring.core.beans;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Dzmitry_Hryhoryeu on 2/18/2016.
 */
public class Event {
    int id;
    String msg;
    Date date;
    DateFormat dateFormat;

    public Event() {
    }

    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
        this.id =  (int )(Math.random() * 50 + 1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }
}
