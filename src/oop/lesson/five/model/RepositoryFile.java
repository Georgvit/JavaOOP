package oop.lesson.five.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);

        user.setId(id);
        if (user.getId().isEmpty()) {
            System.out.println("Не возможно создать ID");
            return null;
        } else {
            users.add(user);
            List<String> lines = new ArrayList<>();
            for (User item : users) {
                lines.add(mapper.map(item));
            }

            fileOperation.saveAllLines(lines);
            return id;
        }
    }


    @Override
    public void UpdateUser(User user, String idUser) {
        int idUsers = Integer.parseInt(idUser);
        user.setId(idUser);
        List<User> users = getAllUsers();
        for (int i = 0; i < users.size(); i++) {
            if (i == idUsers - 1) {
                users.remove(i);
                users.add(i, user);
            }

        }

        List<String> lines = new ArrayList<>();
        for (User item : users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void DeleteAllUsers() {
        List<String> lines = new ArrayList<>();
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void DeleteSelectionUsers(String idUser) {
        int idUsers = Integer.parseInt(idUser);
        List<User> users = getAllUsers();
        for (int i = 0; i < users.size(); i++) {
            if (i == idUsers - 1) {
                users.remove(i);
            }
        }

        List<String> lines = new ArrayList<>();
        for (User item : users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
