package oop.lesson.two;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SavaManagerAnimals {
    public void saveInFile(List<Animal> animals) {
        try (FileWriter writer = new FileWriter("fileName.txt", false)) {
            for (Animal item : animals) {
                writer.write(item.toString() + "\n");
            }
            writer.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
