package oop.houmwork.four;

public class Wizard extends Warrior<Stick, Shield>{
    private int mana;

    public Wizard(String name, Stick weapon, Shield shield, int healthPoint, int mana) {
        super(name, weapon, shield, healthPoint);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Маг -> " + super.toString() + "/ уровень маны: " + mana;
    }
}
