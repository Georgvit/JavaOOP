package oop.lesson.two;

//Создаем абстрактный класс
public abstract class Animal {
    private String animalName;
    private int legs;
    private String owner;

    public Animal(String animalName, int legs, String owner) {
        this.animalName = animalName;
        this.legs = legs;
        this.owner = owner;
    }



    public String getAnimalName() {
        return animalName;
    }

    public int getLegs() {
        return legs;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "{" +
                "animalName = '" + animalName + '\'' +
                ", legs = " + legs +
                ", owner = '" + owner + '\'' +
                '}' + "\n";
    }


//    public abstract String speek();
}
