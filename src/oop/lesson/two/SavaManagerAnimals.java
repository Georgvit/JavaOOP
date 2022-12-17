package oop.lesson.two;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

//Клас для сохранения данных в файл
public class SavaManagerAnimals {
    public void saveInFile(List<Animal> animals) {
        try (FileWriter writer = new FileWriter("fileTest.txt", false)) {
            for (Animal item : animals) {
                writer.write(item.toString() + "\n");
            }
            writer.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveInFileStr(String str) {
        try (FileWriter writer = new FileWriter("fileTest.txt", true)) {
                writer.write(str + "\n");
                writer.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
