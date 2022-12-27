package oop.houmwork.four;

public abstract class Warrior<T extends Weapon, S extends Shield> {
    private String name;
    private T weapon;

    private S shield;
    private int healthPoint;

    public Warrior(String name, T weapon, S shield, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "позывной: '" + name + '\'' +
                "/ оружие: " + weapon +
                "/ доспехи: " + shield +
                "/ здоровье: " + healthPoint;
    }
}
