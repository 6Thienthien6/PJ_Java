package AbstractInterface.Bai3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
//        ComparableCircle[] circles = new ComparableCircle[3];
//        circles[0] = new ComparableCircle(3.6);
//        circles[1] = new ComparableCircle(8.7, "nighthawk", true);
//        circles[2] = new ComparableCircle(3.5, "indigo", false);
//
//        System.out.println("Pre-sorted:");
//
//            System.out.println(circles[1]);
//        System.out.println(circles[2]);
//        System.out.println(circles[0]);
//
//
//        Arrays.sort(circles);
//
//        System.out.println("After-sorted:");
//
//            System.out.println(circles[1].getArea()+ circles[1].getRadius() + circles[1].getColor());
//        System.out.println(circles[2].getArea()+ circles[2].getRadius() + circles[2].getColor());
//        System.out.println( circles[0].getRadius());
//
//    }
}
