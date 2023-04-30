import java.util.NoSuchElementException;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(T element) {
        if (head == null) {
            addFirst(element);
            return;
        }
        Node<T> newNode = new Node<>(element);
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T removed = head.data;
        head = head.next;
        size--;
        return removed;
    }

    public T removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head.next == null) {
            return removeFirst();
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        T removed = current.next.data;
        current.next = null;
        size--;
        return removed;
    }

    public T getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public T getLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        if (index == size) {
            addLast(element);
            return;
        }
        Node<T> newNode = new Node<>(element);
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        T removed = current.next.data;
        current.next = current.next.next;
        size--;
        return removed;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
