package com.telesens.academy.lesson16_File.homework16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReaderFile {

    private int qty = 20;
    public String [] readFromFile (String fileName) {

        String [] array = new String[qty];

        try {
            Scanner scanner = new Scanner(new FileReader((fileName)));

            int i = 0;
            while (i < qty){
                array[i] = scanner.nextLine();
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return array;
    }
}
