package oop.houmwork.four;

public class Archer extends Warrior {
    public Archer(String name, Bow weapon, Shield shield, int healthPoint) {
        super(name, weapon, shield, healthPoint);
    }

    @Override
    public String toString() {
        return "Лучник -> " + super.toString();
    }
}
