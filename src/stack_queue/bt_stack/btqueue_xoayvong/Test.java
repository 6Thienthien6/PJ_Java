package stack_queue.bt_stack.btqueue_xoayvong;

import static stack_queue.bt_stack.btqueue_xoayvong.Solution.*;

public class Test {
    public static void main(String[] args) {
        // Create a queue and initialize front and rear
        Solution.Queue queue = new Solution.Queue();
        queue.front = queue.rear = null;

        // Inserting elements in Circular Queue
        enQueue ( queue, 14 );
        enQueue ( queue, 22 );
        enQueue ( queue, 6 );

        // Display elements present in Circular Queue
        displayQueue ( queue );

        // Deleting elements from Circular Queue
        System.out.printf ( " Deleted value = %d", deQueue ( queue ) );
        System.out.printf ( " Deleted value = %d", deQueue ( queue ) );

        // Remaining elements in Circular Queue
        displayQueue ( queue );

        enQueue ( queue, 9 );
        enQueue ( queue, 20 );
        displayQueue ( queue );

    }



}
