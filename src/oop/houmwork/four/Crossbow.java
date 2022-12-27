package oop.houmwork.four;

public class Crossbow extends Bow {
    @Override
    public int range() {
        return 50;
    }

    @Override
    public int damage() {
        return 17;
    }

    @Override
    public String toString() {
        return "Арбалет, " + super.toString();
    }
}
