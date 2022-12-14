package oop.houmwork.one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class VendingMachines {

    private final List<Products> listProducts;

    //    Конструктор с входящими параметрами
    public VendingMachines(List<Products> listProducts) {
        this.listProducts = listProducts;
    }

    //    Конструктор с параметрами по умолчанию
    public VendingMachines() {
        this.listProducts = new ArrayList<>(List.of(new Products("milk", 1)));
    }

    //    Лямбда функция для фильтрации
    private List<Products> filter(Function<Products, Boolean> f) {
        List<Products> result = new ArrayList<>();
        listProducts.forEach(d -> {
            if (f.apply(d)) {
                result.add(d);
            }
        });
        return result;
    }

    //    Фильтрация по имени
    public List<Products> filterName(String name) {
        return filter(s -> s.getName().equals(name));
    }

    //    Фильтрация по цене
    public List<Products> filterPrice(double prodictPrice) {
        return filter(p -> prodictPrice == p.getPrice());
    }

    //    Выборка по диапазону цены
    public List<Products> filterPriceRange(double minPrice, double maxPrice) {
        return filter(d -> d.getPrice() > minPrice && d.getPrice() < maxPrice);

    }


    //    Переопределяем toString
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        listProducts.forEach(s -> temp.append(s.toString()));
        return "VendingMachine: \n" +
                "listProducts:" + temp;
    }
}
