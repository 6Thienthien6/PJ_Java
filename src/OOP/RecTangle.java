package OOP;

import java.util.Scanner;

public class RecTangle {
    double width, height;

    public double getArea() {
        return this.width* this.height;
    }

    public double getPerimeter() {
        return (this.width+this.height)*2;
    }
    public  String display(){
        return "Rectangle{"+"width="+width +", height=" +height+"}";
    }

    public RecTangle(double width, double height){
        this.width = width;
        this.height= height;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        RecTangle rectangle = new RecTangle(width, height);
        System.out.println("Your Retangle \n"+ rectangle.display());
        System.out.println("Perimeter of the RecTangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " +rectangle.getArea());
    }

}
