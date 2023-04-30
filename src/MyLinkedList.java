import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        E removed = head.data;
        head = head.next;
        size--;
        return removed;
    }

    public E getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        Node<E> newNode = new Node<>(element);
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return removeFirst();
        }
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        E removed = current.next.data;
        current.next = current.next.next;
        size--;
        return removed;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
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

    public boolean contains(E element) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
