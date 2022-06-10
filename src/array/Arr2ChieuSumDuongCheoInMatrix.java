package array;

import java.util.Scanner;

public class Arr2ChieuSumDuongCheoInMatrix {
    public static void main(String[] args) {


        int total = 0;
        int name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bậc của ma trận: ");
        name = scanner.nextInt();

        int oil[][] = new int[name][name];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < name; i++) {
            for (int j = 0; j < name; j++) {
                System.out.print(oil[i][j] + " ");
                oil[i][j] = scanner.nextInt();

            }
        }
        for (int i = 0; i < name; i++) {
            for (int j = 0; j < name; j++) {
                if (i == j) {
                    total += oil[i][j];
                }
            }
        }
        System.out.println("tổng của đường chéo chính là: " + total);
    }
}
