package oop.houmwork.four;

public class LongBow extends Bow {
    @Override
    public int range() {
        return 160;
    }

    @Override
    public int damage() {
        return 15;
    }

    @Override
    public String toString() {
        return "Большой лук, " + super.toString();
    }
}
