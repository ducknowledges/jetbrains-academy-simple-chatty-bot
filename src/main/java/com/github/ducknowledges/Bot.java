package com.github.ducknowledges;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bot {
    private final String name;
    private final int year;

    public Bot() {
        this("R2D2");
    }

    public Bot(String botName) {
        this.name = botName;
        this.year = new GregorianCalendar().get(Calendar.YEAR);
    }

    public String greet() {
        return String.format(
                "Hello! My name is %s.%n"
                + "I was created in %d.", this.name, this.year);
    }

    public String askUserName() {
        return "Please, remind me your name.";
    }

    public String getUserName(String userName) {
        return String.format("What a great name you have, %s!", userName);
    }
}
