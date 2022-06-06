package com.codegym;

import java.util.Scanner;

public class sayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello my friend:" + name);
    }
}
