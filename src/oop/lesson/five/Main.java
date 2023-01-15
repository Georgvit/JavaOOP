package oop.lesson.five;


import oop.lesson.five.controllers.UserController;
import oop.lesson.five.format.SelectionFormat;
import oop.lesson.five.views.ViewUser;

public class Main {
    public static void main(String[] args) {

        UserController controller = new UserController(new SelectionFormat().selectedFormat());
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}