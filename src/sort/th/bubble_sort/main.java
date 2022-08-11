package sort.th.bubble_sort;

import static sort.th.bubble_sort.BubbleSort.bubbleSort;
import static sort.th.bubble_sort.BubbleSort.list;

public class main {
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i <list.length; i++)
            System.out.println(list[i]+ " ");
    }
}
