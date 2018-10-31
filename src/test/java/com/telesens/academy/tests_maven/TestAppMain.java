package com.telesens.academy.tests_maven;

import com.telesens.academy.lesson11_maven.AppMain;
import org.testng.annotations.Test;

public class TestAppMain {

    @Test
    public void testGetHello() {
        String actual = AppMain.getHello();
        String expected = "Hello";
        assert actual.equals(expected);
    }
}
