public class Main {
    public static void main(String[] args) {
        System.out.println("            --------Testing Linked List Stack--------");
        testLinkedListStack();
        System.out.println("            --------Testing Linked List Queue--------");
        testLinkedListQueue();
    }

    private static void testLinkedListStack() {
        MyLinkedListStack<Integer> stack = new MyLinkedListStack();

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(1);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

    private static void testLinkedListQueue() {
        MyLinkedListQueue<Integer> queue = new MyLinkedListQueue();

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(1);

        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}




