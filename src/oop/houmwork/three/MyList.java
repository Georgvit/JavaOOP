package oop.houmwork.three;


import java.util.Iterator;

public class MyList<E> implements Iterable<E> {
    private Node first;
    private Node last;

    public MyList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return first == null;
    }

    //    Добавляем элемент в начало списка
    public void addInFirst(E data) {
        Node temp = new Node(data);

        if (isEmpty()) {
            last = temp;
        } else {
            first.prev = temp;
        }
        temp.next = first;
        first = temp;
    }

    //    Добавляем элемент в конец списка
    public void addInLast(E data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            first = temp;
        } else
            last.next = temp;
        temp.prev = last;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node temp = first;

            @Override
            public boolean hasNext() {
                if (last != null) {
                    last = temp.prev;
                } else temp = temp.next;
                return temp != null;
            }

            @Override
            public E next() {
                return (E) temp.getData();
            }
        };
    }

    // Создаем узел
    private static class Node<E> {
        //  Элемент списка
        public E data;
        //   Ссылка на следующий элемент
        public Node next;

        //   Ссылка на предыдущий элемент
        public Node prev;

        public E getData() {
            return data;
        }

        public Node(E data) {
            this.data = data;
        }
    }
}
