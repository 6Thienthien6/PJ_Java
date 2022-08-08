package demo.LinkListandArrrList;

public class StackArrTest {
    public static void main(String[] args) {
        StackArr stack = new StackArr();
        stack.push(12);
        stack.push(22);
        stack.push(32);
        stack.push(42);
        stack.push(52);
        stack.push(62);
        stack.push(72);
        stack.push(82);
        System.out.println("String of Stack: " + stack);
        System.out.println("size của arr: " + stack.size());
        System.out.println("pop: " + stack.pop());
        while (!stack.isEmpty()) {
            System.out.println(+stack.pop());
        }
    }
}
