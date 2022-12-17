package oop.lesson.two;

public class Dog extends Animal implements Speakable, Runable {
    public Dog(String animalName, int legs, String owner) {
        super(animalName, legs, owner);
    }


    @Override
    public String speak() {
        return "Гав-гав";
    }

    @Override
    public Integer runSpeed() {
        return 20;
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}
