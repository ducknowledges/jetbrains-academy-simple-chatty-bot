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

    @Test
    void shouldOfferToCountNumbers() {
        String actual = "Now I will prove to you that I can count to any number you want.";
        assertThat(actual).isEqualTo(bot.getOfferToCountNumber());
    }

    @Test
    void shouldGetNumbers() {
        String actual = String.format("0!%n" + "1!%n" + "2!%n" + "3!%n" + "4!");
        assertThat(actual).isEqualTo(bot.getNumbers(4));
    }

    @Test
    void shouldSayGoodbay() {
        String actual = "Completed, have a nice day!";
        assertThat(actual).isEqualTo(bot.sayGoodBye());
    }
}