package sort.th.selection_sort1;

public class Selectionn {
    static int[] arr = {3, 5, 9, 2, 4, 1};

    public static int selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return n;
    }
}


