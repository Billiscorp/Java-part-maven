package com.telesens.academy.lesson11_Exceptions;

import java.math.BigDecimal;

public class AppDemo {

    public static void main(String[] args) {
        double d1 = 1;
        double d2 = 0;
        System.out.println(d1/d2);
        // поменять на int для проверки что выведет


        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("3");

        Calculator calc = new Calculator();
        try {
            BigDecimal res = calc.div(b1,b2);
        } catch (DevisionByZero devisionByZero) {
            devisionByZero.printStackTrace();
        }
    }
}
