package abstractInterface.bai3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(4);
        circles[1] = new ComparableCircle(33);
        circles[2] = new ComparableCircle(3.0, "areen", true);
        circles[3] = new ComparableCircle(2,"blue",false);
        System.out.println("Before-sort:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
