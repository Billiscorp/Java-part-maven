package com.telesens.academy.lesson13.classwork13;

/*3) 	a) описать интерфейс ArithmeticOperations, в котором описаны базовые методы калькулятора:
        - сложение*/


import java.math.BigDecimal;

public interface ArithmeticOperations {

    BigDecimal div (BigDecimal x1, BigDecimal x2) throws DevisionByZero;


}
