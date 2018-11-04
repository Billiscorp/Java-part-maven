package com.telesens.academy.lesson11;


import com.telesens.academy.automationpracticeOld.modelUpdate.EntityDressUp;
import com.telesens.academy.automationpracticeOld.modelUpdate.comporator.ComparatorDressByName;
import com.telesens.academy.automationpracticeOld.modelUpdate.comporator.ComparatorDressByNamePriceDesc;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        EntityDressUp[] actualDresses = getActualDresses();
        System.out.println(Arrays.toString(actualDresses));
        Arrays.sort(actualDresses);
        System.out.println(Arrays.toString(actualDresses));
        System.out.println("********** Sort By Name ************");
        Arrays.sort(actualDresses, new ComparatorDressByName());
        System.out.println(Arrays.toString(actualDresses));

        System.out.println("********** Sort By Name and Price Desc************");
        Arrays.sort(actualDresses, new ComparatorDressByNamePriceDesc());
        System.out.println(Arrays.toString(actualDresses));



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
