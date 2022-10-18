package com.github.ducknowledges;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;

class BotTest {

    private final Bot bot = new Bot("Aid");

    @Test
    void shouldGreet() {
        String name = "Aid";
        int year = new GregorianCalendar().get(Calendar.YEAR);
        String actual = String.format(
                "Hello! My name is %s.%n"
                + "I was created in %d.", name, year
        );
        assertThat(actual).isEqualTo(bot.greet());
    }

    @Test
    void shouldAskUserName() {
        String actual = "Please, remind me your name.";
        assertThat(actual).isEqualTo(bot.askUserName());
    }

    @Test
    void shouldPrintUserName() {
        String userName = "Igor";
        String actual = String.format("What a great name you have, %s!", userName);
        assertThat(actual).isEqualTo(bot.getUserName(userName));
    }
}