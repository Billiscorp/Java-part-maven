package com.telesens.academy.test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test {
    private static Random rand =  new Random();

    public static void main(String[] args) {


        for (int i = 0; i < 30; i++) {
            System.out.println(generatePhoneNumber());
        }



    }

    public static String generatePhoneNumber() {

        int middleDigits = rand.nextInt(1_000_0000);

        long phoneNumber = middleDigits;

        return Long.toString(phoneNumber);
    }
}
