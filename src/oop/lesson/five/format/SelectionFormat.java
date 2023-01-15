package oop.lesson.five.format;

import oop.lesson.five.model.*;

import java.util.Scanner;

public class SelectionFormat {

    public Repository selectedFormat() {
        System.out.println("Выберите формат работы с документом:");
        System.out.println("1. TXT \n2. json");
        System.out.println("Введите пункт меню:");
        Scanner in = new Scanner(System.in);
        int selection = Integer.parseInt(in.nextLine().toUpperCase());
        if (selection == 1) {
            FileOperation fileOperation = new FileOperationImpl("users.txt");
            return new RepositoryFile(fileOperation);

        } else {
            FileOperation fileOperation2 = new JFileOperationImpl("jsonUsers.txt");
            return new RepositoryFile(fileOperation2);
        }

    }
}
