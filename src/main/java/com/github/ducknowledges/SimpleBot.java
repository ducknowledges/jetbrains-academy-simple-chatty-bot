package com.github.ducknowledges;

import java.util.Scanner;

public class SimpleBot {

    private final Bot bot;

    public SimpleBot(Bot bot) {
        this.bot = bot;
    }

    public static void main(String[] args) {
        Bot bot = new Bot("Aid");
        SimpleBot botRunner = new SimpleBot(bot);
        botRunner.run();
    }

    public void run() {
        printGreet();
        printAskUserName();
        printUserName();
        printOfferToGuessTheAge();
        printUserAge();
    }

    public void printGreet() {
        print(bot.greet());
    }

    public void printAskUserName() {
        print(bot.askUserName());
    }

    public void printUserName() {
        Scanner scanner = new Scanner(System.in);
        print(bot.getUserName(scanner.next()));
    }

    public void printOfferToGuessTheAge() {
        print(bot.getOfferToGuessTheAge());
    }

    public void printUserAge() {
        Scanner scanner = new Scanner(System.in);
        print(bot.getUserAge(
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
        ));
    }

    private void print(String string) {
        System.out.println(string);
    }
}

