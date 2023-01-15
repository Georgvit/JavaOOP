package oop.lesson.five.model;

import java.util.List;

public class JFileOperationImpl extends FileOperationImpl{
    private String fileName;
    public JFileOperationImpl(String fileName) {
        super(fileName);
    }

    @Override
    public List<String> readAllLines() {
        return super.readAllLines();
    }

    @Override
    public void saveAllLines(List<String> lines) {
        super.saveAllLines(lines);
    }
}
