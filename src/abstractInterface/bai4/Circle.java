package abstractInterface.bai4;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                +getRadius()
                + ", Which is subclass of"
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.printf("%s%.3f","New size of Circle is: " , getArea()+ getArea()*(percent/100));
    }
}
