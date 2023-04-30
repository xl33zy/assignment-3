import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private MyLinkedList<T> list;

    public MyLinkedListQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T element) {
        list.addLast(element);
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
