package abstractInterface.bai2;

import abstractInterface.bai3.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(56,"red",true);
        circles[1] = new Circle(8.2, "while", false);
        circles[2] = new Circle();
        System.out.println("Pre- Sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After - Sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
    }

