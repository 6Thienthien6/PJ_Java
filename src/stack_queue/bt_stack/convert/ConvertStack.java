package stack_queue.bt_stack.convert;

import java.util.Scanner;
import java.util.Stack;

public class ConvertStack {
    public static void main(String[] args) {
        // khởi tạo stack rỗng
        Stack stack = new Stack();
        Scanner input = new Scanner(System.in);
        System.out.println("Number need convert: ");
        int number = input.nextInt();
        // chuyển đổi từ thập phân -> nhị phân = %2
        int NUM = number;
        while (number != 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        // đọc hết stack => nối chuỗi
        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop();
        }
        System.out.println("result: " + NUM +
                " = " + "(" + str + ")" + "B");

    }
}
