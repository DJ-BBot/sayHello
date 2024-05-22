package com.Greetings;

public class GreetingsMain {

    public static void main(String [] args) {
        Greetings greeting = new Greetings("What's up?");
        System.out.println(greeting.getGreeting());
    }
}