package oop.lesson.two;

//Создаем класс Рыба
public class Fish extends Animal implements Swimable{
    public Fish(String animalName, int legs, String owner) {
        super(animalName, legs, owner);
    }

    @Override
    public Integer swimmingSpeed() {
        return 50;
    }
}
