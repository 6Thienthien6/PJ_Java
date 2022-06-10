package array;

public class CountCharacterString {
    public static void main(String[] args) {
        String str = "TranDaiThienThien";
        char character = 'n';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.toLowerCase().charAt(i)) {
                count++;
            }
        }
        System.out.printf("Số lần chữ cái xuất hiện trong chuỗi là: %d", count);

    }
}
