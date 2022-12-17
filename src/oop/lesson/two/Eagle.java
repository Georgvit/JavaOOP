package oop.lesson.two;

//Создаем класс Орел
public class Eagle extends Animal implements Speakable, Runable, Flyable {
    public Eagle(String animalName, int legs, String owner) {
        super(animalName, legs, owner);
    }

    @Override
    public Integer flySpeed() {
        return 66;
    }

    @Override
    public Integer runSpeed() {
        return 2;
    }

    @Override
    public String speak() {
        return "Aйч-айч";
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public String toString() {
        return "Eagle " + super.toString();
    }
}
