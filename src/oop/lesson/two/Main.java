package oop.lesson.two;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Murka", 4, "Olga"))
                .addAnimal(new Dog("Tom", 4, "Peter"))
                .addAnimal(new Dog("Rex", 4, "Max"))
                .addAnimal(new Duck("Utka", 2, "Fedor"))
                .addAnimal(new Eagle("Orel", 2, "Egor"));

        System.out.println(zoo);
        System.out.println(zoo.talk());


        for (Runable item : zoo.getRunable()) {
            System.out.println("Скорость бега - " + zoo.getName(zoo.animals.indexOf(item)) + " - " + item.runSpeed());
        }
        for (Flyable item : zoo.getFlyable()) {
            System.out.println("Скорость полета - " + zoo.getName(zoo.animals.indexOf(item)) + " - " + item.flySpeed());
        }

        System.out.println("Max speed run: " + zoo.getChampionSpeed());
        System.out.println("Max speed fly: " + zoo.getChampionSpeedFly());

        SavaManagerAnimals savaManagerAnimals = new SavaManagerAnimals();
        savaManagerAnimals.saveInFile(zoo.getAnimals());
    }

}
