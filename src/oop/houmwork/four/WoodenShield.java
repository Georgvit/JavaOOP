package oop.houmwork.four;

public class WoodenShield extends Shield{
    @Override
    public int protection() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Деревянный щит, уровень защиты %s", protection());
    }
}
