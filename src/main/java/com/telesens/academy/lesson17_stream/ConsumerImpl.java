package com.telesens.academy.lesson17_stream;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("next el: " + s);
    }
}
