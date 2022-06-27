package Menu.User;

import Menu.UserView;

import java.util.Scanner;

public class ShowProduct {
    public static void showProducts(){


        boolean end = true;
        do {
            System.out.println("============== PRODUCT==================");
            System.out.println("*                     1. Produclist   *");
            System.out.println("*                     2. Turn Back   *");
            System.out.println("*                                   *");
            System.out.println("==================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("PRODUCT LIST ");
                    break;
                case 2:

                    UserView.pickMe();
                    break;
                default:
                    System.out.println("Xin mời chọn lại.( 1 hoặc 2) ");
                    break;
            }
        }while (end);
    }
}
