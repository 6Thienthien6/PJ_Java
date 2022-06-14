package Demo;

public class binarySearch {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 41, 42, 44, 45, 58, 98, 99, 111, 3000, 3333, 9999};

        System.out.println(nope(arr, 9999));

    }

    public static int nope(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // kiểm tra xem x có ở chính giữa không
            if (arr[mid] == x) {
                return mid;
                // Nếu x nhỏ hơn, bỏ qua nửa bên phải
            } else if (arr[mid] > x) {
                high = mid - 1;
                // Nếu x lớn hơn, bỏ qua nửa bên trái
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}