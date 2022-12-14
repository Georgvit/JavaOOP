package oop.houmwork.one;

//Создаем класс фрукты
public class Fruit extends Products {

    //    Добавляем выбор вида фруктов
    private TypeFruit fruitType;

    //    Создаем конструктор
    public Fruit(String name, double price, TypeFruit fruitType) {
        super(name, price);
        this.fruitType = fruitType;
    }

    //    Создаем гетеры и сетеры
    public TypeFruit getFruitType() {
        return fruitType;
    }

    public void setFruitType(TypeFruit fruitType) {
        this.fruitType = fruitType;
    }


    //  Переопределяем toString
    @Override
    public String toString() {
        return super.toString() +
                " fruitType = " + fruitType;
    }
}
