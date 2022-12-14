package oop.houmwork.one;

import oop.lesson.one.Product;

public class SodaWater extends Product {

    //    Добавляем поле в класс
    private String flavor;

    //    Создаем конструктор с параметрами
    public SodaWater(String name, double price, String flavor) {
        super(name, price);
        this.setFlavor(flavor);
    }

    //    Создаем гетеры и сеттеры
    public String getFlavor() {
        return flavor;
    }

    private void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    //    Переопределяем toString
    @Override
    public String toString() {
        return super.toString() + "" +
                " flavor product = " + flavor;
    }
}

