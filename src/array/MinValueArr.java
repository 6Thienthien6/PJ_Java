package array;

public class MinValueArr {


    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 12, 75, 32, 33, -5, 2};
        int armor = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[armor]);

    }

    public static int minValue(int[] array) {
        int armor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[armor]) {
                armor = i;
            }
        }
        return armor;


    }
}
