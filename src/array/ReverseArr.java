package array;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 7, 8};
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
