package oop.houmwork.four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();
    private Comandor comandor;

    public Team(Comandor comandor) {

        this.comandor = comandor;
    }

    public Comandor getComandor() {
        return comandor;
    }

    public void addWarrios(T newWarrior) {
        warriors.add(newWarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage() {
        int sumDamage = 0;
        for (T item : this) {
            sumDamage += item.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getAllHealPoint() {
        int sumHealPoint = 0;
        for (T item : this) {
            sumHealPoint += item.getHealthPoint();
        }
        return sumHealPoint;
    }

    public int getMaxRadius() {
        int maxRange = 0;
        for (T i : this) {
            Weapon weapon = i.getWeapon();
            if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if (maxRange < bow.range()) {
                    maxRange = bow.range();
                }
            }
        }
        return maxRange;
    }
}

