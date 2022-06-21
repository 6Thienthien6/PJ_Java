package Inheritance.CirclenCylinder;

public class testCircle {
    public static void main(String[] args) {
        Circle clne = new Circle();
        System.out.println("DeFaul Parameter: "+ clne.getArea());
        clne = new Circle(2.6,"bubble");
        System.out.println("Area: "+clne.getArea());
        System.out.println("Radius: "+clne.getRadius());
        System.out.println("Co lò: "+clne.getColor());

    }
}
