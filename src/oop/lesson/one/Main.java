package oop.lesson.one;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("Soda", 34.4);
//        System.out.println(water);

        VendingMachine machineOne = new VendingMachine();
        System.out.println(machineOne);

        System.out.println();

        List<Product> merchandise = new ArrayList<>();
        merchandise.add(water);
        merchandise.add(new Product("wine", 400));
        merchandise.add(new Product("cheese", 23.7));
        merchandise.add(new Product("meet", 13.7));
        merchandise.add(new SodaWater("Cola", 1.2, "coll"));

        VendingMachine machineTwo = new VendingMachine(merchandise);
        System.out.println(machineTwo);
        System.out.println();
        System.out.println(machineTwo.filterName("meet"));
        System.out.println();
        System.out.println(machineTwo.filterPriceRange(13, 30));
        System.out.println();
        System.out.println(machineTwo.filterPrice(13.7));


    }
}