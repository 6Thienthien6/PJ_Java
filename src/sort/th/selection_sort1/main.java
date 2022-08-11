package sort.th.selection_sort1;

import static sort.th.selection_sort1.Selectionn.arr;
import static sort.th.selection_sort1.Selectionn.selectionSort;

public class main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int size = scanner.nextInt();
//        double[] arr = new double[size];
//        System.out.println("Enter " + arr.length + " values");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.print("Your input list: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
        System.out.println(selectionSort(arr));
        selectionSort(arr);
        System.out.println("Begin Sorting...");
        for (int item : arr)
            System.out.print(item + " ");

    }
}
