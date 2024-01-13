package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dosto!");
        System.out.println("Today's lucky number: "+randomGen());
    }
    private static int randomGen(){
        return (int) (Math.random() * 100);
    }
}