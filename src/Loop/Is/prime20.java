package Loop.Is;

public class prime20 {
    public static void main(String[] args) {
        int count = 0;
        int first = 2;
        while (count < 20) {
            int dem = 0;
            for (int i = 2; i < first; i++) {
                if (first % i == 0) {
                    dem += 1;
                }
            }
            if (dem == 0) {
                System.out.println(first);
                count++;
            }
            first++;
        }
    }
}
