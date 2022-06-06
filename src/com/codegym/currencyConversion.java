package com.codegym;


import java.util.Scanner;

public class currencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        long USD;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        USD = scanner.nextLong();
         long rate = USD * 23000;
        System.out.print("Giá trị đổi:" + rate);


    }
}