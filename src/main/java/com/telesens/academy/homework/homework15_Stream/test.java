package com.telesens.academy.homework.homework15_Stream;

public class test {
    private static String name;

    public static void main(String[] args) {

        name = "Вася";
//        System.out.println(name.substring(0,1).toLowerCase());
        System.out.println(name.replace(name.substring(0,1),name.substring(0,1).toLowerCase()));
    }
}
