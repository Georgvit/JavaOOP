package oop.houmwork.four;

public class IronShield extends Shield{
    @Override
    public int protection() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Железный щит, уровень защиты %s", protection());
    }
}
