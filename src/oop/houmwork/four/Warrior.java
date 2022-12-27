package oop.houmwork.four;

public abstract class Warrior<T extends Weapon> {
    private String name;
    private T weapon;
    private int healthPoint;

    public Warrior(String name, T weapon, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
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
                "/ здоровье: " + healthPoint;
    }
}
