package oop.houmwork.four;

public class Barbarian extends Warrior<Axe, Shield> {
    public Barbarian(String name, Axe weapon, Shield shield, int healthPoint) {
        super(name, weapon, shield, healthPoint);
    }

    @Override
    public String toString() {
        return "Варвар -> " + super.toString();
    }
}
