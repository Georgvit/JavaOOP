package oop.lesson.two;

import java.util.ArrayList;
import java.util.List;


//Клас объединяющий животных
public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> temp = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Speakable) {
                temp.add((Speakable) item);
            }
        }
//        temp.add(new Radio());
        return temp;
    }

    private List<String> getNames() {
        List<String> temp = new ArrayList<>();
        for (Animal item : animals) {
            temp.add(item.getAnimalName());
        }
        return temp;
    }

    public List<Runable> getRunable() {
        List<Runable> temp = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                temp.add((Runable) item);
            }
        }
        return temp;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> temp = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                temp.add((Flyable) item);
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

    public String talk() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Speakable item : getSpeakable()) {
            stringBuilder.append(item.speak() + "\n");
        }
        return stringBuilder.toString();
    }


    public int getChampionSpeed() {
        int max = getRunable().indexOf(0);
        for (Runable item : getRunable()) {
            if (item.runSpeed() > max) {
                max = item.runSpeed();
            }
        }
        return max;
    }

    public int getChampionSpeedFly() {
        int max = getFlyable().indexOf(0);
        for (Flyable item : getFlyable()) {
            if (item.flySpeed() > max) {
                max = item.flySpeed();
            }
        }
        return max;
    }

    public String getName(Integer index) {
        return getNames().get(index);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> temp = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Swimable) {
                temp.add((Swimable) item);
            }
        }
        return temp;
    }
}
