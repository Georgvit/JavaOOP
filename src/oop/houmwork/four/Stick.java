package oop.houmwork.four;

public class Stick implements Weapon{
    @Override
    public int damage() {
        return 200;
    }

    @Override
    public String toString() {
        return String.format("Посох, урон от магии %d",damage());
    }
}
