package OOP;

public class TestSimpleCircle {

    public static void main(String[] args) {
        TestSimpleCircle circle1 = new TestSimpleCircle(1);
        System.out.println("The area of the circle of radius " + circle1.radius + " is: " + circle1.getArea());
        TestSimpleCircle circle2 = new TestSimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is: " + circle2.getArea());
        TestSimpleCircle circle3 = new TestSimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is: " + circle3.getArea());
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is: " + circle2.getArea());
    }
    double radius;
    //Dựng một đường tròn có bán kính
    TestSimpleCircle() {
        radius = 1;
    }
//  Dựng một đường tròn với bán kính xác định
    TestSimpleCircle(double newRadius) {
        radius = newRadius;
    }
// return lại diện tích hình tròn
    double getArea() {
        return radius * radius * Math.PI;
    }
    //trả về chu vi của hình tròn
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
   // đặt bán kính mới cho vòng tròn này
    void setRadius(double newRadius) {
        radius = newRadius;
    }

}
