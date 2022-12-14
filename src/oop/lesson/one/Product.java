package oop.lesson.one;

public class Product {
    //    Создание полей класса
    private String name;
    private double price;

    //  Создаем конструктор с параметрами
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //    Создаем сеттеры и геттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //    Переопределяем toString
    @Override
    public String toString() {
        return "\n" + "oop.lesson.one.Product " +
                "name = '" + name + '\'' +
                ", price = " + price +
                " руб.";
    }
}
