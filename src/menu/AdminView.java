package menu;

import menu.Admin.ManagerOrder;
import menu.Admin.ManagerProduct;
import menu.Admin.ManagerUser;

import java.util.Scanner;

public class AdminView {

    public static void Account() {
        Scanner scanner = new Scanner(System.in);
        boolean myID = true;
        do {
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Password: ");
            String pw = scanner.nextLine();
            if (id.equals("Admin") && pw.equals("Admin")) {
                myID = false;
                Adminview();
            }
        } while (myID);
    }

    public static void Adminview() {


        boolean end= true;
        do {

            System.out.println("================== ADMIN ===========================");
            System.out.println("            1.Manager User                        ");
            System.out.println("            2.Manager Product                    ");
            System.out.println("            3.Manager Order                     ");
            System.out.println("            4. Log Out                         ");
            System.out.println("----------------------------------------------");
            System.out.println(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    ManagerUser.managerUser();
                    break;
                case 2:
                    ManagerProduct.managerProduct();
                    break;
                case 3:
                    ManagerOrder.managerOrder();
                    break;
                case 4:
                    end = false;
                    break;
                default:
                    System.out.println("Xin mời chọn lại.( 1, 2, 3 hoặc 4) ");
                    break;
            }
        } while (end);
    }
}







