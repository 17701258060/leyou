package com.myself.demo;

public class LambdaDemo {
    public static void main(String[] args) {
        final String salutation = "Hello";
        final String myname = "I an lambda ";
        String today = "2018/10/11";
        Sayhello service = message -> {
            System.out.println(salutation+message+myname);
        };
        service.say("word!");
    }
}

interface Sayhello{
    void say(String message);
}