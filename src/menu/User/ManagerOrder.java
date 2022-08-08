package menu.User;

import menu.UserView;

import java.util.Scanner;

public class ManagerOrder {
    public static void managerOrder(){


        boolean end = true;
        do {
            System.out.println("=========== MANAGER ORDER==========");
            System.out.println("*               1. Show my Orde      *");
            System.out.println("*               2. Add new Order       *");
            System.out.println("*               3. Delete Order          *");
            System.out.println("*               4. Turn back               *");
            System.out.println("==============================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Show my Order");
                    break;
                case 2:
                    System.out.println("Add new Order  ");
                    break;
                case 3:
                    System.out.println("Delete Order");
                    break;
                case 4:

                    UserView.pickMe();
                    break;
                default: System.out.println("Xin mời chọn lại.( 1, 2, 3 Hoặc 4) ");
                  break;
            }
        }while (end);
    }
}
