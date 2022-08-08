package menu.Admin;

import java.util.Scanner;

public class ManagerUser {
    public static void managerUser() {
        boolean end = true;
        do {
            System.out.println("=========== MANAGER USER ===========");
            System.out.println("*               1. Add New User        *");
            System.out.println("*               2. Delete User           *");
            System.out.println("*               3. Show User List          *");
            System.out.println("*               4. Turn Back                 *");
            System.out.println("=================================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println(" Add New User ");
                    break;
                case 2:
                    System.out.println(" Delete User ");
                    break;
                case 3:
                    System.out.println(" Show User List ");
                case 4:
                    end = false;
                    break;
                default:
                    System.out.println("xin mời chọn lại.(1, 2, 3 hoặc 4");
                  break;
            }
        }while (end);
    }
}
