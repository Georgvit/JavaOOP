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
        repository.CreateUser(user);
    }

    public void updateSaveUser(User user, String id) {
        repository.UpdateUser(user, id);
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

    public List<User>  readUserList(){
        List<User> users = repository.getAllUsers();
        return users;
    }
}
