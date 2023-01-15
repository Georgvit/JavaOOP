package oop.lesson.five.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void UpdateUser(User user, String idUser);
    void DeleteAllUsers();

    void DeleteSelectionUsers(String idUser);
}