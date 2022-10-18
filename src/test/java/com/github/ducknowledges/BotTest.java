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
    void shouldGetUserName() {
        String userName = "Igor";
        String actual = String.format("What a great name you have, %s!", userName);
        assertThat(actual).isEqualTo(bot.getUserName(userName));
    }

    @Test
    void shouldOfferToGuessTheAge() {
        String actual = String.format(
                "Let me guess your age.%n"
                + "Enter remainders of dividing your age by 3, 5 and 7.");
        assertThat(actual).isEqualTo(bot.getOfferToGuessTheAge());
    }

    @Test
    void shouldGetUserAge() {
        int remainder3 = 1;
        int remainder5 = 2;
        int remainder7 = 1;
        String actual = String.format("Your age is %d; that's a good time to start programming!", 22);
        assertThat(actual).isEqualTo(bot.getUserAge(remainder3, remainder5, remainder7));
    }
}