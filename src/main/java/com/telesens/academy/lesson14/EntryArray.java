package com.telesens.academy.lesson14;

import java.util.Arrays;

public class EntryArray {

    public static void main(String[] args) {
        Entry[] entries = {
                new Entry(12L, "name1"),
                new Entry(11L, "name4"),
                new Entry(10L, "name3")
        };
        // Вывести
        System.out.println(Arrays.toString(entries));

        //TODO разобраться !!!!!
        // Сортировать
        Arrays.sort(entries);
        System.out.println(Arrays.toString(entries));

        // Сортировать
        Arrays.sort(entries, new ByKeyComparator());
        System.out.println(Arrays.toString(entries));
    }


}
