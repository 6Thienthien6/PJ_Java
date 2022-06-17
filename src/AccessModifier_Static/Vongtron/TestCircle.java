package AccessModifier_Static.Vongtron;

public class TestCircle {
    public static void main(String[] args) {
        Circle x = new Circle();
        x.setRadius(4.084);
        x.setColor("blueBerry");
        x.getArea();
        System.out.println(x.getArea());
        System.out.println(x.getColor());
        System.out.println(x.getRadius());
    }
}
