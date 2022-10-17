package com.github.ducknowledges;

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
        System.out.println(bot.greet());
    }
}

