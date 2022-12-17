package oop.lesson.two;

//Создаем класс Кот
public class Cat extends Animal implements Speakable, Runable {
    public Cat(String animalName, int legs, String owner) {
        super(animalName, legs, owner);
    }

    @Override
    public String speak() {
        return "Мяу-мяу";
    }

    @Override
    public Integer runSpeed() {
        return 25;
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
