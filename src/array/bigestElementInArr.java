package array;

public class bigestElementInArr {
    public static void main(String[] args) {
        //khai báo mảng arr  và khởi tạo các giá trị cho các element trong mảng
        int arr[] = {-1, -4, 2, 5, 21, 6, 8, -15};
        //gán giá trị của phần tử đầu tiên cho max, sau đó dùng max so sánh với các phần tử còn lại trong mảng.
        int max = arr[0];
        //in các phần tử trong mảng ra màn hình
        System.out.println("Các phần tử trong mảng là: ");
        for (int i : arr) {
            System.out.print(i + ", ");

        }
        //dùng vòng lặp for duyệt các phần tử trong mảng. so sánh max với từng phần tử nếu số nào lớn hơn max thì gán nó cho max.
        // cứ lặp như vậy cho đến hết các phần tử thì max sẽ là giá trị lớn nhất trong mảng.
        for (int num : arr) {
            if (max < num)
                max = num;
        }
        System.out.printf("số lớn nhất trong mảng là: " + max);
    }
}
