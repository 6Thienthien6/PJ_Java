package sort.th.selection_sort;

public class Selection {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        int leng = list.length;
        for (int i = 0; i < leng; i++) {
            double min = list[i];
            int index = i;
            for (int j = i + 1; j < leng; j++) {
                if (min > list[j]) {
                    min = list[j];
                    index = j;
                }
            }
            if (index != i) {
                list[index] = list[i];
                list[i] = min;
            }
        }
    }
}



