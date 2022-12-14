package oop.houmwork.one;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Products water = new Products("Soda", 34.4);

        VendingMachines machineOne = new VendingMachines();
        System.out.println(machineOne);

        System.out.println();

        List<Products> merchandise = new ArrayList<>();
        merchandise.add(water);
        merchandise.add(new Products("wine", 400));
        merchandise.add(new Products("cheese", 23.7));
        merchandise.add(new Products("meet", 13.7));
        merchandise.add(new SodaAndWater("Cola", 1.2, "coll"));


        VendingMachines machineTwo = new VendingMachines(merchandise);
        System.out.println(machineTwo);
        System.out.println();
        System.out.println(machineTwo.filterName("meet"));
        System.out.println();
        System.out.println(machineTwo.filterPriceRange(13, 30));
        System.out.println();
        System.out.println(machineTwo.filterPrice(13.7));

        List<Products> merchandiseFruit = new ArrayList<>();
        merchandiseFruit.add(new Fruit("apple", 10.1, TypeFruit.SEEDS));
        merchandiseFruit.add(new Fruit("pear", 11.2, TypeFruit.SEEDS));
        merchandiseFruit.add(new Fruit("apricot", 9.5, TypeFruit.STONE));
        merchandiseFruit.add(new Fruit("plum", 10, TypeFruit.STONE));
        merchandiseFruit.add(new Fruit("orange", 10.1, TypeFruit.CITRUS));
        merchandiseFruit.add(new Fruit("lime", 10.1, TypeFruit.CITRUS));
        merchandiseFruit.add(new Fruit("banana", 10.1, TypeFruit.TROPICAL));
        merchandiseFruit.add(new Fruit("figs", 10.1, TypeFruit.TROPICAL));

        System.out.println(merchandiseFruit);
        VendingMachines machineThree = new VendingMachines(merchandiseFruit);
        System.out.println(machineThree.filterName("apple"));



    }
}
