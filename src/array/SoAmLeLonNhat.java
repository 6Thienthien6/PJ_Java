package array;

public class SoAmLeLonNhat {
    public static void main(String[] args) {
        int arr[] = {-5, -2, -6, -11, -42, -1, -6, 8, 2, 5, 3};
        int max = (int) Math.pow(-2, 31);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (arr[i] % 2 != 0) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
            }
        }
        if (max == (int) Math.pow(-2, 31)) {
            System.out.printf("false");
        } else {
            System.out.println(max);
        }

    }
}