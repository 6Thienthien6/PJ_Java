package demo;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] myArr = {-10, 9, 11, 22, 51, 2, 50, 6, 7, 10, 15};
        sort(myArr);
        System.out.println("Từ số nhỏ nhất đến số lớn nhất: " + Arrays.toString(myArr));
        sortReverse(myArr);
        System.out.println("Từ số lớn nhất đến số nhỏ nhất: " + Arrays.toString(myArr));

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (minValue > array[j]) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = minValue;
                array[minIndex] = temp;
            }
        }

    }
// tìm ngược lại từ số lớn nhất đến nhỏ nhất
    public static void sortReverse(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxValue = array[i];
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (maxValue < array[j]) {
                    maxValue = array[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = array[i];
                array[i] = maxValue;
                array[maxIndex] = temp;
            }
        }


    }
}
