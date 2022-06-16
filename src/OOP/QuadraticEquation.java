package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    private double x1, x2;
    private double delta;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = b * b - 4 * a * c;
    }

    public void calculate() {
        if (this.delta > 0) {
            x1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            x2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm: \nx1 = " + x1 + "\nx2 = + x2");
        }else if (this.delta ==0){
            x1 =(-b+Math.pow(delta, 0.5))/(2*a);
            System.out.println("Phương trình chỉ có 1 nghiệm: \nx1 = " +x1);
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }


    public static void main(String[] args) {
       QuadraticEquation eq1 = new QuadraticEquation(1,5,9);
        QuadraticEquation eq2 = new QuadraticEquation(2,10,0);
        QuadraticEquation eq3 = new QuadraticEquation(1,6,3);
        eq1.calculate();
        eq2.calculate();
        eq3.calculate();


    }

}
