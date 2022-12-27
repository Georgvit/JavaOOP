package oop.houmwork.four;

public class Barbarian extends Warrior<Axe> {
    public Barbarian(String name, Axe weapon, int healthPoint) {
        super(name, weapon, healthPoint);
    }

    @Override
    public String toString() {
        return "Варвар -> " + super.toString();
    }
}
