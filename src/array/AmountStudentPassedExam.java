package array;

import java.util.Scanner;

public class AmountStudentPassedExam {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner urani = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size = urani.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30: ");

        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("enter mark of student: " + (i + 1) + ": ");
            array[i] = urani.nextInt();
            if (array[i] < 0 || array[i] > 10) {
                System.out.println("điểm không hợp lệ");
                System.out.println("mời nhập lại điểm cho học sinh" + (i + 1) + ":");

            }
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
            count++;
        }
        System.out.print("\n The number of student passing the exam is: " + count);
    }
}
