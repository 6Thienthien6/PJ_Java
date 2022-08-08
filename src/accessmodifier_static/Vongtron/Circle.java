package accessmodifier_static.Vongtron;
public class Circle {
    private double radius=1.0;
    private String color = "red";
    Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color =color;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.round(radius*radius*Math.PI*2);
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



}




