package abstractInterface.colorable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle);
        circle =new Circle(3.2);
        System.out.println(circle);
        circle=new Circle(3.2,"eggMan",false);
        System.out.println(circle);
    }
}
