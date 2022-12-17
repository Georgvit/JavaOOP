package oop.lesson.two;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //  Создаем новый объект zoo и добавляем животных
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Murka", 4, "Olga"))
                .addAnimal(new Dog("Tom", 4, "Peter"))
                .addAnimal(new Dog("Rex", 4, "Max"))
                .addAnimal(new Duck("Utka", 2, "Fedor"))
                .addAnimal(new Eagle("Orel", 2, "Egor"))
                .addAnimal(new Fish("Nemo", 0, "Ivan"));

        System.out.println(zoo);
//        System.out.println(zoo.talk());

        //  Сохранение ссписка в файл
        SavaManagerAnimals savaManagerAnimals = new SavaManagerAnimals();
        savaManagerAnimals.saveInFile(zoo.getAnimals());

        //  Выводим характеристики каждого жиавотного и записываем в файл

        for (Speakable item : zoo.getSpeakable()) {
            System.out.println(zoo.getName(zoo.animals.indexOf(item)) + " - говорит - " + item.speak());
            savaManagerAnimals.saveInFileStr(zoo.getName(zoo.animals.indexOf(item)) + " - говорит - " + item.speak());
        }

        for (Runable item : zoo.getRunable()) {
            System.out.println("Скорость бега - " + zoo.getName(zoo.animals.indexOf(item)) + " - " + item.runSpeed());
            savaManagerAnimals.saveInFileStr("Скорость бега - " + zoo.getName(zoo.animals.indexOf(item)) + " - " + item.runSpeed());
        }
        for (Flyable item : zoo.getFlyable()) {
            System.out.println("Скорость полета - " + zoo.getName(zoo.animals.indexOf(item)) + " - " + item.flySpeed());
            savaManagerAnimals.saveInFileStr("Скорость полета - " + zoo.getName(zoo.animals.indexOf(item)) + " - " + item.flySpeed());
        }
        for (Swimable item : zoo.getSwimable()) {
            System.out.println("Скорость плаванья - " + zoo.getName(zoo.animals.indexOf(item)) + " - " + item.swimmingSpeed());
            savaManagerAnimals.saveInFileStr("Скорость плаванья - " + zoo.getName(zoo.animals.indexOf(item)) + " - " + item.swimmingSpeed());
        }

        //  Сравнение характеристик животных
        System.out.println("Max speed run: " + zoo.getChampionSpeed());
        savaManagerAnimals.saveInFileStr("Max speed run: " + zoo.getChampionSpeed());
        System.out.println("Max speed fly: " + zoo.getChampionSpeedFly());
        savaManagerAnimals.saveInFileStr("Max speed fly: " + zoo.getChampionSpeedFly());


    }

}
