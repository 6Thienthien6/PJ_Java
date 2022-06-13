package com.codegym;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số muốn đọc thành chữ : ");
        int number = sc.nextInt();
        int first = number / 100;
        int second = (number % 100) / 10;
        int third = number % 10;
        System.out.println("Số sau khi đọc thành chữ : ");
        String result = null;
        if (number < 10) {
            result = one2Nine(third);
            System.out.println(result);
        }
        if (number >= 10 && number < 20) {
            result = _10_to_19(third);
            System.out.println(result);
        }
        if (number > 19 && number < 100) {
            result = _20_to_99(second);
            if (third != 0) {
                result += " " + one2Nine(third);
            }
            System.out.println(result);
        }
        if (number > 99) {
            if (first != 0) {
                result = one2Nine(first) + " hundred ";
                if (second == 0) {
                    if (third != 0) {
                        result += one2Nine(third);
                    }
                    result += "";
                }
                if (second == 1) {
                    result += _10_to_19(third);
                }
                if (second != 0 && second != 1) {
                    if (third != 0) {
                        result += one2Nine(third);
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static String _20_to_99(int number) {
        String second = null;
        switch (number) {

            case 2:
                second = "Twenty";
                break;
            case 3:
                second = "Thirty";
                break;
            case 4:
                second = "Forty";
                break;
            case 5:
                second = "Fifty";
                break;
            case 6:
                second = "sixty";
                break;
            case 7:
                second = "Seventy";
                break;
            case 8:
                second = "Eighty";
                break;
            case 9:
                second = "Ninety";
                break;

        }
        return second;
    }

    public static String _10_to_19(int number) {
        String dome = null;
        switch (number) {
            case 0:
                dome = "ten";
                break;
            case 1:
                dome = "Elevent";
                break;
            case 2:
                dome = "Twelve";
                break;
            case 3:
                dome = "Thirteen";
                break;
            case 4:
                dome = "Forteen";
                break;
            case 5:
                dome = "Fifteen";
                break;
            case 6:
                dome = "Sixteen";
                break;
            case 7:
                dome = "Seventeen";
                break;
            case 8:
                dome = "Eighteen";
                break;
            case 9:
                dome = "Nineteen";
                break;
        }
        return dome;
    }

    public static String one2Nine(int number) {
        String donviSt = null;
        switch (number) {
            case 0:
                donviSt = "Zero";
                break;
            case 1:
                donviSt = "One";
                break;
            case 2:
                donviSt = "Two";
                break;
            case 3:
                donviSt = "Three";
                break;
            case 4:
                donviSt = "Four";
                break;
            case 5:
                donviSt = "Five";
                break;
            case 6:
                donviSt = "Six";
                break;
            case 7:
                donviSt = "Seven";
                break;
            case 8:
                donviSt = "Eight";
                break;
            case 9:
                donviSt = "Nine";
                break;
        }
        return donviSt;
    }
}
