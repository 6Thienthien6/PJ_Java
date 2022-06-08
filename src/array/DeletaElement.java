package array;

import java.util.Scanner;

public class DeletaElement {
    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 4, 3, 2, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xóa trong mảng: ");
        int input = scanner.nextInt();
        int count = 0;
        do {
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1) {
                    if (arr[i] == input) {
                        input =0;
                        arr[i] = arr[i + 1];
                        arr[i + 1] = input;

                    }
                }
            }
            count++;

        } while (count < arr.length);
        for (int a : arr){
        System.out.println(a + " ");

        }
    }
}
