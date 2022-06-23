package Menu;

import Menu.Admin.ManagerOrder;
import Menu.User.ManagerInfor;
import Menu.User.ShowProduct;
import java.util.Scanner;

public class    UserView {
    public static void userView() {
        System.out.println("=============USER=============");
        System.out.println("********* 1. Manager User****** *");
        System.out.println("********* 2. Manager Order*****   *");
        System.out.println("**        3. Show Product     *     *");
        System.out.println("          4. Log out          *       *");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" ⭆ ");
    }
    public static void pickMe(){

        boolean end = false;
        do {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    ManagerInfor.Infomation();
                    break;
                case 2:
                    ManagerOrder.managerOrder();
                    break;
                case 3:
                    ShowProduct.showProducts();
                    break;
                case 4:Home.Login();
                    break;
                default: System.out.println("Xin mời chọn lại.( 1, 2, 3 hoặc 4) ");
                    end = true;
            }
        }while (end);
    }
}
