package Loop.Is;

import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {


    Scanner sc = new Scanner (System.in);
    double money = 1.0;
    int month = 1;
    double interestRate = 1.0;
   System.out.println("Nhập số tiền bạn muốn gửi: ");
    money = sc.nextDouble();
        System.out.println("nhập số tháng muốn gửi: ");
        month = sc.nextInt();
        System.out.println("Nhập lãi xuất theo tỉ lệ %");
        interestRate = sc.nextDouble();
        double TotalInterest = 0;
        for (int i = 0; i < month; i++){
TotalInterest += money *(interestRate/100)/12 * month;

        }
        System.out.printf("Tiền lãi là %.2f  ", TotalInterest);
}
}
