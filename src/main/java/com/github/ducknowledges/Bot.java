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

    public String getOfferToGuessTheAge() {
        return String.format(
                "Let me guess your age.%n"
                        + "Enter remainders of dividing your age by 3, 5 and 7.");
    }

    public String getUserAge(int remainder3, int remainder5, int remainder7) {

        String age =  String.valueOf(
                (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
        );
        return String.format("Your age is %s; that's a good time to start programming!", age);
    }

    public String getOfferToCountNumber() {
        return "Now I will prove to you that I can count to any number you want.";
    }

    public String getNumbers(int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += String.format("%d!%n", i);
        }
        result += String.format("%d!", number);
        return result;
    }

    public String getOfferToAskTheQuestion() {
        return "Let's test your programming knowledge.";
    }

    public String askTheMethodQuestion() {
        return String.format("Why do we use methods?%n"
            + "1. To repeat a statement multiple times.%n"
            + "2. To decompose a program into several small subroutines.%n"
            + "3. To determine the execution time of a program.%n"
            + "4. To interrupt the execution of a program.");
    }

    public String getRightAnswerToTheMethodQuestion() {
        return "2";
    }

    public String suggestANewAttempt() {
        return "Please, try again.";
    }

    public String sayCongratulations() {
        return "Congratulations, have a nice day!";
    }
}
