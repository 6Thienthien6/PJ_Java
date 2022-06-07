package Loop.Is;

public class sntNhohon100 {
    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {
            int star = 0;
            for (int j =2 ; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    star += 1;
                }
            }
            if (star == 0)
                System.out.print(i + " ");


        }
    }
}
