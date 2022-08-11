package sort.th.selection_sort;

import static sort.th.selection_sort.Selection.list;
import static sort.th.selection_sort.Selection.selectionSort;

public class main {
    public static void main(String[] args) {
        selectionSort(list);
        int i;
        System.out.println("Thứ tự sắp xếp là");
        for (i = 0; i < list.length; i++)

        System.out.println(list[i]);
    }
}
