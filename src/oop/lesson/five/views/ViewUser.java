package oop.lesson.five.views;

import oop.lesson.five.controllers.UserController;
import oop.lesson.five.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = prompt("Имя: ");
                    String lastName = prompt("Фамилия: ");
                    String phone = prompt("Номер телефона: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(id);
                        System.out.println(user);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    try {
                        List<User> users = userController.readUserList();
                        for (User user: users) {
                            System.out.println(user);
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(id);
                        switch (parameterSelection()){
                            case 1:
                                String newFirstName = prompt("Имя: ");
                                user.setFirstName(newFirstName);
                                userController.updateSaveUser(user, id);
                                System.out.println("Данные изменены.");
                                break;
                            case 2:
                                String newLastName = prompt("Фамилия: ");
                                user.setLastName(newLastName);
                                userController.updateSaveUser(user, id);
                                System.out.println("Данные изменены.");
                                break;
                            case 3:
                                String newTelefonNumber = prompt("Телефон: ");
                                user.setPhone(newTelefonNumber);
                                userController.updateSaveUser(user, id);
                                System.out.println("Данные изменены.");
                                break;
                        }

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }
        }
    }

    private int parameterSelection(){
        System.out.println("Какие параметры хотите изменить?");
        System.out.println("1. Имя \n2.Фамилия \n3.Телефон");
        int selection = Integer.parseInt(prompt("Введите пункт меню:"));
        return selection;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}