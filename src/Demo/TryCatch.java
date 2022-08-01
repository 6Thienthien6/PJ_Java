package Demo;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("nhập vào số nguyên n: ");
            n = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("nhập không đúng");
        }
        finally {
            System.out.println("Final");
        }

        System.out.println("giá trị vừa nhập là: " +n);

        System.out.println("Kết thúc");

    }

}
