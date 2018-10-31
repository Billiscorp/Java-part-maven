package com.telesens.academy.automationpractice;

public class TestRunner {

    public static void main(String[] args) {
        CartTests cartTests = new CartTests();
        cartTests.init("chrome", "http://automationpractice.com/index.php");
        cartTests.testAddDresToCart();
    }
}
