package array;

import java.util.Scanner;

public class tongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Bạn muốn tính tổng cột nào, xin mời nhập cột : ");
        int num = sc.nextInt();
        do {
            System.out.println("Cột không tồn tại, xin mời nhập lại cột : ");
            num = sc.nextInt();
        } while (num > array.length || num < 1);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Tổng là : ");
        int total = 0;
        for (int j = 0; j < array.length; j++) {
            if ((j + 1) == num) {
                for (int i = 0; i < array[j].length; i++) {
                    total += array[i][j];
                }
                System.out.println(total);
            }
        }
    }
}
