package demo.LinkListandArrrList;

import java.util.LinkedList;

public class linkedLink {
    public static void main(String[] args) {
        // Khai báo 1 Linked List có tên là cars
        // có kiểu là String
        LinkedList<String> cars = new LinkedList<String>();
        // Thêm các phần tử vào list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //HIển thị các phẩn tử cửa list
        System.out.println("Các phần tử trong list là: ");
        System.out.println(cars);
    }
    }

