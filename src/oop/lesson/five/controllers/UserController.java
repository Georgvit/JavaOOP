package oop.lesson.five.controllers;

import oop.lesson.five.model.Repository;
import oop.lesson.five.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }


    public void saveUser(User user) {
        if (validation(user)) {
            repository.CreateUser(user);
        }
    }

    public void updateSaveUser(User user, String id) {
        repository.UpdateUser(user, id);
    }

    public void deleteAllDate() {
        repository.DeleteAllUsers();
    }

    public void deleteSelectionDate(String idUser) {
        repository.DeleteSelectionUsers(idUser);

    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("Запись не найдена");
    }

    public List<User> readUserList() {
        List<User> users = repository.getAllUsers();
        return users;
    }

    private boolean validation(User user) {
        if (user.getFirstName().contains(" ") || user.getFirstName() == null) {
            System.out.println("Имя содержит недопустимые символы");
            return false;
        } else if (user.getLastName().contains(" ") || user.getLastName() == null) {
            System.out.println("Фамилия содержит недопустимые символы");
            return false;
        } else if (user.getPhone().contains(" ") || user.getPhone() == null) {
            System.out.println("Телефон содержит недопустимые символы");
            return false;
        } else return true;
    }
}
