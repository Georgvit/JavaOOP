package oop.lesson.three;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Egor", "Vitov", 30));
        personal.addUser(new User("Egor", "Vitov", 26));
        personal.addUser(new User("Ivan", "Loshov", 31));
        personal.addUser(new User("Yana", "Vostroilov", 27));
        personal.addUser(new User("Mariya", "Penkova", 25));
        personal.addUser(new User("Max", "Iva", 35));

        Personal personal1 = new Personal();
        personal1.addUser(new User("Elena", "Dub", 31));
        personal1.addUser(new User("Anna", "Osina", 21));
        personal1.addUser(new User("Ivan", "Kalita", 49));
        personal1.addUser(new User("Yana", "Zubova", 32));
        personal1.addUser(new User("Mariya", "Martova", 33));
        personal1.addUser(new User("Alexandr", "Saidov", 40));

        User bigBos = new User(personal, "Ivan", "Vetrov", 40);
        User smallBos = new User(personal1, "Peter", "Penkov", 45);
        personal.addUser(smallBos);


        for (User item : personal) {
            System.out.println(item);
        }
        System.out.println("**********************************************");

        Collections.sort(personal.getUsers());

        personal.forEach(System.out::println);

        System.out.println("************************************************");
        Company company = new Company(bigBos);
        for (User item : company) {
            System.out.println(item);
        }
        System.out.println("************************************************");


    }
}
