package Inheritance.Geometric;

public class Rec extends Shape {
    private double width = 1.0;;
public double length =1.0;
public Rec(){

}
public Rec(double width, double length){
this.width = width;
this.length=length;
}
public Rec(double width, double length, String color, boolean filled){
    super(color, filled);
    this.width = width;
    this.length = length;
}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
    return  width*this.length;
    }
    public double getPerimeter(){
    return 2*(width+this.length);
    }
    @Override
    public String toString(){
    return "A Rectangle with width="
            +getWidth()
            +"and length="
            +getLength()
            +", which is subclass of "
            + super.toString();
    }
}
