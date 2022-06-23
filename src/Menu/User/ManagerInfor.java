package Menu.User;

import Menu.UserView;

import java.util.Scanner;
public class ManagerInfor {
    public static void Infomation(){
        System.out.println("============= INFOMATION ===============");
        System.out.println("*               1. Change Infomation     *");
        System.out.println("*               2. Add Infomation           *");
        System.out.println("*               3. Delete Infomation            *");
        System.out.println("*               4. Turn back                       *");
        System.out.println("=======================================================");
        System.out.print(" ⭆ ");
        boolean end = false;
        do {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Change infomation");
                    break;
                case 2:
                    System.out.println("Add infomation");
                    break;
                case 3:
                    System.out.println("Delete infomation");
                    break;
                case 4:
                    UserView.userView();
                    UserView.pickMe();
                    break;
                default: System.out.println("Xin mời chọn lại.( 1, 2, 3 hoặc 4) ");
                    end = true;
            }
        }while (end);
    }
}
