import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement;
        if (index == 0) {
            removedElement = head.element;
            head = head.next;
            if (size == 1) {
                tail = null;
            }
        } else {
            Node<E> previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            removedElement = previous.next.element;
            previous.next = previous.next.next;
            if (index == size - 1) {
                tail = previous;
            }
        }
        size--;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            public boolean hasNext() {
                return current != null;
            }

            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }
}