package Menu;

import java.util.Scanner;

public class Home {

    public static void Login(){

        System.out.println("*******==========LOGIN===========*******");
        System.out.println("*                                      *");
        System.out.println("*****       1. Login by Admin      *****");
        System.out.println("*                                      *");
        System.out.println("*****       2. Login by User       *****");
        System.out.println("*                                      *");
        System.out.println("*****       3. Create User         *****");
        System.out.println("----------------------------------------");
        System.out.println(" ⭆ ");

        Scanner scanner = new Scanner(System.in);
        boolean trust = false;
        do {
            int youChose = scanner.nextInt();
            switch (youChose){
                case 1: AdminView.Account();
                    break;
                case 2: UserView.userView();
                    break;
                case 3:CreateUser.CreateUser();
                    break;
                default: System.out.println("Xin mời chọn lại.( 1, 2 hoặc 3) ");
                    trust = true;
            }
        }while (trust);
    }
    }


