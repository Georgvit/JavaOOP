package oop.houmwork.four;

public class Comandor extends Warrior<Weapon> {
    public Comandor(String name, Weapon weapon, int healthPoint) {
        super(name, weapon, healthPoint);
    }

    @Override
    public String toString() {
        return "Командир -> " + super.toString();
    }
}
