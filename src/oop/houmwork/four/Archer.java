package oop.houmwork.four;

public class Archer extends Warrior {
    public Archer(String name, Bow bow, int healthPoint) {
        super(name, bow, healthPoint);
    }

    @Override
    public String toString() {
        return "Лучник -> " + super.toString();
    }
}
