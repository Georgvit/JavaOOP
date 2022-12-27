package oop.houmwork.four;

public abstract class Bow implements Weapon {
    public abstract int range();

    @Override
    public String toString() {
        return String.format("радиус поражени %d, урон %d", range(), damage());
    }
}
