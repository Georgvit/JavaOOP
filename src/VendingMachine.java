import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {

    private final List<Product> listProducts;

    //    Конструктор с входящими параметрами
    public VendingMachine(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    //    Конструктор с параметрами по умолчанию
    public VendingMachine() {
        this.listProducts = new ArrayList<>(List.of(new Product("milk", 1)));
    }

    //    Лямбда функция для фильтрации
    private List<Product> filter(Function<Product, Boolean> f) {
        List<Product> result = new ArrayList<>();
        listProducts.forEach(d -> {
            if (f.apply(d)) {
                result.add(d);
            }
        });
        return result;
    }

    //    Фильтрация по имени
    public List<Product> filterName(String name) {
        return filter(s -> s.getName().equals(name));
    }

    //    Фильтрация по цене
    public List<Product> filterPrice(double prodictPrice) {
        return filter(p -> prodictPrice == p.getPrice());
    }

    //    Выборка по диапазону цены
    public List<Product> filterPriceRange(double minPrice, double maxPrice) {
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
