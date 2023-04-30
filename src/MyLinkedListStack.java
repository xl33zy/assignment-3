public class MyLinkedListStack<T> {
    private MyLinkedList<T> list;

    private class Node<T> {
        private T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }
}
