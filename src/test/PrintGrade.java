package test;

public class PrintGrade {
    public static void printGrade(double point) {
        if (point < 0 || point > 100) {
            System.out.println("invalid point");
            return;
        }
        if (point >= 90.0) {
            System.out.println("A");
        } else if (point >= 80.0) {
            System.out.println("B");
        } else if (point >= 70.0) {
            System.out.println("C");
        } else if (point >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
