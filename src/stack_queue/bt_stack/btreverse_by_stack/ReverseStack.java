package stack_queue.bt_stack.btreverse_by_stack;

import java.util.Stack;

public class ReverseStack {
    public static String ReverseString(String string) {
        char[] reverseString = new char[string.length ()];
        Stack<Character> stack = new Stack<> ();
        for (int i = 0; i < string.length (); i++) {
            stack.push ( string.charAt ( i ) );
        }

        int i = 0;
        while (!stack.isEmpty ()){
            reverseString[i++] = stack.pop ();
        }
        return new String (reverseString);
    }
}
