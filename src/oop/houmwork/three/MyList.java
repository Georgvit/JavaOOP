package oop.houmwork.three;


import java.util.Iterator;

public class MyList implements Iterable<Integer>{
    private Node first;
    private Node last;

    public MyList() {
        first = null;
        last = null;
    }

    private boolean isEmpty(){
        return first == null;
    }

//    Добавляем элемент в начало списка
    public void addInFirst(int data){
        Node temp = new Node(data);

        if (isEmpty()){
            last = temp;
        }
        else {
            first.prev = temp;
        }
        temp.next = first;
        first = temp;
    }

//    Добавляем элемент в конец списка
    public void addInLast(int data){
        Node temp = new Node(data);
        if (isEmpty()){
            first = temp;
        }
        else
            last.next = temp;
        temp.prev = last;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node temp = first;

            @Override
            public boolean hasNext() {
                if (last != null) {
                    last = temp.prev;
                }
                else temp = temp.next;
                return temp != null;
            }

            @Override
            public Integer next() {
                return temp.getData();
            }
        };
    }


    private static class Node {
        //  Элемент списка
        public int data;
        //   Ссылка на следующий элемент
        public Node next;

        //   Ссылка на предыдущий элемент
        public Node prev;

        public int getData() {
            return data;
        }

        public Node(int data) {
            this.data = data;
        }
    }
}
