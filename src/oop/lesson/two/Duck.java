package oop.lesson.two;

//Создаем класс Утка
public class Duck extends Animal implements Speakable, Runable, Flyable, Swimable{
    public Duck(String animalName, int legs, String owner) {
        super(animalName, legs, owner);
    }

    @Override
    public Integer flySpeed() {
        return 10;
    }

    @Override
    public Integer runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Кря-кря";
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public String toString() {
        return "Duck " + super.toString();
    }

    @Override
    public Integer swimmingSpeed() {
        return 8;
    }
}
