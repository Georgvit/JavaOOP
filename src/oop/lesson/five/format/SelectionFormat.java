package oop.lesson.five.format;

import oop.lesson.five.model.*;

import java.util.Scanner;

public class SelectionFormat {
    private int selectionUser;

    public Repository selectedFormat() {
        String formFile;
        selectionUser = prompt();
        UserMapper userMapper;
        if (selectionUser == 1) {
            formFile = "users.txt";
            userMapper = new UserMapper();
        } else {
            formFile = "htmlUsers.html";
            userMapper = new NewUserMapper();
        }
        FileOperation fileOperation = new FileOperationImpl(formFile);
        return new RepositoryFile(fileOperation, userMapper);

    }

    private int prompt() {
        System.out.println("Выберите формат работы с документом:");
        System.out.println("1. TXT \n2. html");
        System.out.println("Введите пункт меню:");
        Scanner in = new Scanner(System.in);
        return Integer.parseInt(in.nextLine().toUpperCase());
    }
}
