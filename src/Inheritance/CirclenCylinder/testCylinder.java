package Inheritance.CirclenCylinder;

public class testCylinder {
    public static void main(String[] args) {
        Cylinder clnee = new Cylinder();
        System.out.println("thông số mặc định của hình trụ là: "+ clnee);
        System.out.println("Các thông số của hình trụ:");
        clnee = new Cylinder(2, 3, "RedHawk");
        System.out.println("Radius is: " + clnee.getRadius());
        System.out.println("height is: " + clnee.getHeight());
        System.out.println("color is: " + clnee.getColor());
        System.out.println("Diện tích(Area): " + clnee.getArea());
        System.out.println("Thể tích(Volume): " + clnee.getVolume());

    }
}
