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
    public void shouldAskUserName() {
        new SimpleBot(new Bot()).askUserName();
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
}
