package com.telesens.academy.lesson14;

import java.util.Comparator;

public class ByKeyComparator implements Comparator<Entry> {

    //TODO разобраться !!!!!

    @Override
    public int compare(Entry o1, Entry o2) {
        return Long.compare(o1.getKey(), o2.getKey());
    }
}
