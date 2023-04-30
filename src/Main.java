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

    }

    private static void testLinkedListQueue() {

    }
}




