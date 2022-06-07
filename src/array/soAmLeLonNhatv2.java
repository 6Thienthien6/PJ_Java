package array;

public class soAmLeLonNhatv2 {
        public static void main(String[] args) {
            int[] myArray = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
            int soAmLonNhat = Integer.MIN_VALUE;
            System.out.println(soAmLonNhat);
            System.out.print("Array: ");
            for (int i : myArray) {

                if (i < 0 && i % 2 != 0 && i > soAmLonNhat) soAmLonNhat = i;
                System.out.print(i + " ");
            }
            System.out.println("\n So Am Le Lon Nhat Trong Mang La: " + soAmLonNhat);
        }
}
