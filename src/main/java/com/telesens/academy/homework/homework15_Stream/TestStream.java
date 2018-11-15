package com.telesens.academy.homework.homework15_Stream;

import java.util.*;

public class TestStream {

    public static void main(String[] args) {

            // For test
            System.out.println("***    Generate Subscibers   TEST !!!!! ***");
            System.out.println();
            Long id;
            String firstName;
            String lastName;
            int age;
            String phoneNumber;


            Subscriber[] tesrSubscibers  = new Subscriber [10];

            tesrSubscibers[0] = new Subscriber (1L,firstName="Вася", lastName="Половик", age=48, phoneNumber="9991068735"); // id
            tesrSubscibers[1] = new Subscriber (1L,firstName="Вася", lastName="Половик", age=48, phoneNumber="9991068735");

            tesrSubscibers[2] = new Subscriber (2L,firstName="Паша", lastName="Половик", age=48, phoneNumber="9991068735"); // firstName
            tesrSubscibers[3] = new Subscriber (2L,firstName="Паша", lastName="Половик", age=48, phoneNumber="9991068735");

            tesrSubscibers[4] = new Subscriber (3L,firstName="Вася", lastName="Михайленко", age=48, phoneNumber="9991068735"); //lastName
            tesrSubscibers[5] = new Subscriber (3L,firstName="Вася", lastName="Михайленко", age=48, phoneNumber="9991068735");

            tesrSubscibers[6] = new Subscriber (4L,firstName="Вася", lastName="Половик", age=55, phoneNumber="9991068735"); //age
            tesrSubscibers[7] = new Subscriber (4L,firstName="Вася", lastName="Половик", age=55, phoneNumber="9991068735");

            tesrSubscibers[8] = new Subscriber (5L,firstName="Вася", lastName="Половик", age=48, phoneNumber="9992929800"); //phoneNumber
            tesrSubscibers[9] = new Subscriber (5L,firstName="Вася", lastName="Половик", age=48, phoneNumber="9992929800");

            System.out.println(Arrays.toString(tesrSubscibers));

            System.out.println();
            System.out.println("***Finish***");
            System.out.println();


            System.out.println("Из массива:\n" +
                    "                - исключить дубликаты\n" +
                    "                - отсортировать по id,\n" +
                    "                - сохранить в список (List)");
            Set<Subscriber> setSubscibers = new HashSet(Arrays.asList(tesrSubscibers)); //  tesrSubscibers  arraySubscibers
            List<Subscriber> listSubscibers = new ArrayList<>(setSubscibers);
            listSubscibers.stream()
                    .sorted((Comparator.comparing(Subscriber::getId)));
            System.out.println(listSubscibers);
            System.out.println();


    }
}
