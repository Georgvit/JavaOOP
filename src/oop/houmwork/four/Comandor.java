package oop.houmwork.four;

public class Comandor extends Warrior<Weapon, Shield> {
    public Comandor(String name, Weapon weapon, Shield shield, int healthPoint) {
        super(name, weapon, shield, healthPoint);
    }

    @Override
    public String toString() {
        return "Командир -> " + super.toString();
    }
}
