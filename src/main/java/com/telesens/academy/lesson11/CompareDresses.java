package com.telesens.academy.lesson11;


import com.telesens.academy.automationpracticeUpdate.modelUpdate.EntityDressUp;

import java.util.Arrays;

public class CompareDresses {
    public static void main(String[] args) {
        String[] expectedModels = {"demo_1", "demo_3", "demo_4", "demo_5"};
        String[] actualModels = {"demo_3", "demo_4", "demo_1", "demo_5"};

        EntityDressUp[] expectedDresses = getExpectedDresses();
        EntityDressUp[] actualDresses = getActualDresses();
        boolean assertByModel = compare(expectedModels, actualModels);
        boolean assertByDress = compare(expectedDresses, actualDresses);

        // Input Detail Report
        System.out.println("Expected models: ");
        System.out.println("Actual models: ");
        System.out.println("Comparing: " + assertByModel);

        System.out.println("Expected dresses: ");
        System.out.println("Actual dresses: ");
        System.out.println("Comparing: " + assertByDress);
    }

    // TODO
    private static boolean compare(String[] expected, String[] actual) {

        Arrays.sort(expected);
        Arrays.sort(actual);

        return Arrays.equals(expected, actual);

    }

    // TODO
    private static boolean compare(EntityDressUp[] expected, EntityDressUp[] actual) {

        Arrays.sort(expected);
        Arrays.sort(actual);

        return Arrays.equals(expected, actual);

    }

    private static EntityDressUp[] getExpectedDresses() {
        return new EntityDressUp[]{
                new EntityDressUp()
                        .withModel("demo_1")
                        .withName("Faded Short Sleeve T-shirts")
                        .withColor("Orange")
                        .withSize("S")
                        .withPrice(16.51),

                new EntityDressUp()
                        .withModel("demo_3")
                        .withName("Printed Dress")
                        .withColor("Orange")
                        .withSize("S")
                        .withPrice(26.00),

                new EntityDressUp()
                        .withModel("demo_4")
                        .withName("Printed Dress")
                        .withColor("Beige")
                        .withSize("S")
                        .withPrice(50.99),

                new EntityDressUp()
                        .withModel("demo_5")
                        .withName("Printed Summer Dress")
                        .withColor("Yellow")
                        .withSize("S")
                        .withPrice(28.98),
        };
    }

    private static EntityDressUp[] getActualDresses() {
        return new EntityDressUp[]{
                new EntityDressUp()
                        .withModel("demo_3")
                        .withName("Printed Dress")
                        .withColor("Orange")
                        .withSize("S")
                        .withPrice(26.00),

                new EntityDressUp()
                        .withModel("demo_4")
                        .withName("Printed Dress")
                        .withColor("Beige")
                        .withSize("S")
                        .withPrice(50.99),

                new EntityDressUp()
                        .withModel("demo_1")
                        .withName("Faded Short Sleeve T-shirts")
                        .withColor("Orange")
                        .withSize("S")
                        .withPrice(16.51),

                new EntityDressUp()
                        .withModel("demo_5")
                        .withName("Printed Summer Dress")
                        .withColor("Yellow")
                        .withSize("S")
                        .withPrice(28.98),
        };
    }
}