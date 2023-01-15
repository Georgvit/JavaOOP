package oop.lesson.five;


import oop.lesson.five.controllers.UserController;
import oop.lesson.five.model.FileOperation;
import oop.lesson.five.model.FileOperationImpl;
import oop.lesson.five.model.Repository;
import oop.lesson.five.model.RepositoryFile;
import oop.lesson.five.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}