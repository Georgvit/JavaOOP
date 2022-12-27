package oop.houmwork.four;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------Команда 1----------------------------");
        Comandor comandor = new Comandor("Волкодав", new LongBow(), 250);
        Team<Archer> archer = new Team<>(comandor);
        archer.addWarrios(new Archer("Петр", new LongBow(), 120));
        archer.addWarrios(new Archer("Иван", new LongBow(), 120));
        System.out.println(comandor);
        archer.forEach(item -> System.out.println(item));
        System.out.println("Командный урон - " + archer.getAllDamage());
        System.out.println("Командное здоровье - " + archer.getAllHealPoint());
        System.out.println("Максимольный радиус поражения - " + archer.getMaxRadius());


        System.out.println("------------------------Команда 2----------------------------");
        Comandor comandor2 = new Comandor("Рысь", new LongBow(), 255);
        Team<Barbarian> barbarians = new Team<>(comandor2);
        barbarians.addWarrios(new Barbarian("Серый лис", new Sekira(), 130));
        barbarians.addWarrios(new Barbarian("Сокрушитель", new Sekira(), 135));
        System.out.println(comandor2);
        barbarians.forEach(item -> System.out.println(item));
        System.out.println("Командный урон - " + barbarians.getAllDamage());
        System.out.println("Командное здоровье - " + barbarians.getAllHealPoint());
        System.out.println("Максимольный радиус поражения - " + barbarians.getMaxRadius());

        System.out.println("------------------------Команда 3----------------------------");
        Comandor comandor3 = new Comandor("Лютый", new Sekira(), 270);
        Team<Warrior> warriors = new Team<>(comandor3);
        warriors.addWarrios(new Barbarian("Белый", new Sekira(), 135));
        warriors.addWarrios(new Archer("Сокол", new Crossbow(), 140));
        System.out.println(comandor3);
        warriors.forEach(item -> System.out.println(item));
        System.out.println("Командный урон - " + warriors.getAllDamage());
        System.out.println("Командное здоровье - " + warriors.getAllHealPoint());
        System.out.println("Максимольный радиус поражения - " + warriors.getMaxRadius());

    }
}
