package oop.houmwork.four;

public class MagicShield extends Shield{
    @Override
    public int protection() {
        return 180;
    }

    @Override
    public String toString() {
        return String.format("Магический щит, уровень защиты %s", protection());
    }
}
