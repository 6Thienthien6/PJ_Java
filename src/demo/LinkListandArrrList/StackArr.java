package demo.LinkListandArrrList;

import java.util.ArrayList;

public class StackArr {
    private ArrayList<Integer> stackDemo;

    // Constructor to create Stack.
    public StackArr() {

        stackDemo = new ArrayList<Integer>();
    }

    public void push(Integer I) {
        stackDemo.add(I);
    }

    public Integer pop() {
        if (stackDemo.size() == 0) {
            throw new IllegalStateException("xì tách i em pờ ti");
        }
        return stackDemo.remove(stackDemo.size() - 1);
    }

    public String toString() {
        return  stackDemo.toString();
    }

    public int size() {
        return stackDemo.size();
    }

    public boolean isEmpty() {

        return (stackDemo.size() == 0);
    }
}
