package oop.houmwork.four;

public class Wizard extends Warrior{
    private int mana;

    public Wizard(String name, Weapon weapon, int healthPoint, int mana) {
        super(name, weapon, healthPoint);
        this.mana = mana;
    }
}