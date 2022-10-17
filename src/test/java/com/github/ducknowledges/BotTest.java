package com.github.ducknowledges;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.assertj.core.api.Assertions.*;

class BotTest {

    @Test
    void shouldGetGreet() {
        String name = "Aid";
        int year = new GregorianCalendar().get(Calendar.YEAR);
        Bot bot = new Bot(name);
        String actual = String.format("Hello! My name is %s.\nI was created in %d.", name, year);
        assertThat(actual).isEqualTo(bot.greet());
    }
}