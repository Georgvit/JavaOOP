package oop.houmwork.three;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.addInFirst(12);
        myList.addInFirst(13);
        myList.addInFirst(11);
        myList.addInFirst(10);
        myList.addInFirst(19);
        myList.addInFirst(17);
        myList.addInFirst(66);
        myList.addInLast(55);

        for (Integer item: myList) {
            System.out.println(item);
        }
        System.out.println("**************************************");

        MyList<String> myList1 = new MyList<>();
        myList1.addInFirst("Ivan");
        myList1.addInFirst("Peter");
        myList1.addInFirst("Sergeo");

        for (String item: myList1) {
            System.out.println(item);
        }
    }
}
