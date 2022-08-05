package StackQueue.THStack;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        // Đồ dài của mảng sau khi Push
        System.out.println("1.2. Pop elements from stack : ");
        System.out.println("Lấy các phần tử  và xóa luôn phần tử: ");

        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
        // độ dài của mảng sau khi Pop
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        // Đồ dài của mảng sau khi Push

        System.out.println("2.2. Pop elements from stack : ");
        System.out.println("Lấy các phần tử  và xóa luôn phần tử: ");
        // Pop  phần tử theo thứ tự
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
        // độ dài của mảng sau khi Pop

    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }

}