package oop.houmwork.four;

public class Sekira extends Axe {
    @Override
    public int damage() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("Секира, урон %d", damage());
    }
}
