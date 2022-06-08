package array;

import java.util.Scanner;

public class AddValueonArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int number = scanner.nextInt();
        System.out.println("Enter number do you want add: ");
        int input = scanner.nextInt();
        System.out.println("Enter index do you want add: ");
        int index = scanner.nextInt();
        int []arr  = new int[number];
        if (index< number && index >=0){
            arr[index] = input;
            System.out.println(arr[index]);

        }else {
            System.out.println("over limited of array !!!");
        }
        for (double x : arr){
            System.out.println(x+ " ");
        }
    }
}
