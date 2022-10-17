package com.github.ducknowledges;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.assertj.core.api.Assertions.*;

public class SimpleBotTest {

    @Test
    public void shouldPrintGreet() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream outStream = new PrintStream(out);
        System.setOut(outStream);

        String name = "Aid";
        int year = new GregorianCalendar().get(Calendar.YEAR);
        Bot bot = new Bot(name);

        new SimpleBot(bot).run();
        assertThat(out.toString()).isEqualTo(
                String.format("Hello! My name is %s.%nI was created in %d.%n", name, year)
        );
    }
}
