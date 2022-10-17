package com.github.ducknowledges;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bot {
    private final String name;
    private final int year;

    public Bot(String botName) {
        this.name = botName;
        this.year = new GregorianCalendar().get(Calendar.YEAR);
    }

    public String greet() {
        return String.format("Hello! My name is %s.%nI was created in %d.", this.name, this.year);
    }
}
