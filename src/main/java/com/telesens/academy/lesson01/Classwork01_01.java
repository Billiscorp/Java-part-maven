package com.telesens.academy.lesson01;

public class Classwork01_01 {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(args[0]);
        // System.out.println(args[0]);

        if (args.length == 1) {
            String name = args[0];
            System.out.println("Happy New Year " + name + "!");
        }
        else
            System.out.println("Happy New Year!");
    }
}
