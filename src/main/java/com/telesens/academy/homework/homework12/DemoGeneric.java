package com.telesens.academy.homework.homework12;

public class DemoGeneric {

    public static void main(String[] args) {

        Integer[] array =  {1,2,3,4,5};

        GenArray <Integer> genArray = new GenArray <> (array);
        System.out.println(genArray);
    }
}
