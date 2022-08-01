package AbstractInterface.Bai2;

public class Circle {

    private double radius;
    private String color;
    private boolean filled;

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;

    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

