package com.github.ducknowledges;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleBotTest {

    private ByteArrayOutputStream output;

    @BeforeEach
    public void setup() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void shouldPrintGreet() {
        String name = "Aid";
        int year = new GregorianCalendar().get(Calendar.YEAR);
        Bot bot = new Bot("Aid");

        new SimpleBot(bot).printGreet();
        assertThat(output.toString()).isEqualTo(
                String.format(
                        "Hello! My name is %s.%n"
                        + "I was created in %d.%n", name, year));
    }

    @Test
    public void shouldPrintAskUserName() {
        new SimpleBot(new Bot()).printAskUserName();
        assertThat(output.toString()).isEqualTo(
                String.format("Please, remind me your name.%n")
        );
    }

    @Test
    public void shouldPrintUserName() {
        String userName = "User";
        System.setIn(new ByteArrayInputStream(userName.getBytes()));
        new SimpleBot(new Bot()).printUserName();
        assertThat(output.toString()).isEqualTo(
                String.format("What a great name you have, %s!%n", userName)
        );
    }

    @Test
    public void shouldPrintOfferToGuessTheAge() {
        new SimpleBot(new Bot()).printOfferToGuessTheAge();
        assertThat(output.toString()).isEqualTo(
                String.format(
                        "Let me guess your age.%n"
                        + "Enter remainders of dividing your age by 3, 5 and 7.%n")
        );
    }

    @Test
    public void shouldPrintUserAge() {
        int userAge = 22;
        int remainder3 = 1;
        int remainder5 = 2;
        int remainder7 = 1;
        String input = String.format("%d%n %d%n %d%n", remainder3, remainder5, remainder7);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new SimpleBot(new Bot()).printUserAge();
        assertThat(output.toString()).isEqualTo(
                String.format("Your age is %d; that's a good time to start programming!%n", userAge)
        );
    }

    @Test
    public void shouldPrintOfferToCountNumbers() {
        new SimpleBot(new Bot()).printOfferToCountNumbers();
        assertThat(output.toString()).isEqualTo(
                String.format("Now I will prove to you that I can count to any number you want.%n")
        );
    }

    @Test
    public void shouldPrintNumbers() {
        int n1 = 0;
        int n2 = 1;
        int n3 = 2;
        int n4 = 4;
        String input = String.format("%d%n" + "%d%n" + "%d%n" + "%d%n", n1, n2, n3, n4);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        new SimpleBot(new Bot()).printNumbers();
    }

    @Test void shouldSayGoodbye() {
        new SimpleBot(new Bot()).printGoodBye();
        assertThat(output.toString()).isEqualTo(
                String.format("Completed, have a nice day!%n")
        );
    }
}
