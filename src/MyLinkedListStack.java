public class MyLinkedListStack<T> {
    private MyLinkedList<T> list;

    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }

    public void push(T element) {
        list.addFirst(element);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
