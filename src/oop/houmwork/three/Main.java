package oop.houmwork.three;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addInFirst(12);
        myList.addInFirst(13);
        myList.addInFirst(11);
        myList.addInFirst(10);
        myList.addInFirst(19);
        myList.addInFirst(17);
        myList.addInFirst(66);

        for (Integer item: myList) {
            System.out.println(item);
        }
    }
}
