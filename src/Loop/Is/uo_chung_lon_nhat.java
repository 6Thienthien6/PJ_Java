package Loop.Is;

import javax.swing.*;
import java.util.Scanner;

public class uo_chung_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        a = sc.nextInt();
        System.out.print(" enter b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
