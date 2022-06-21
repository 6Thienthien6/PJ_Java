package Inheritance.Class2Dvs3D;

import java.util.Arrays;

public class Point2d extends Point{
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2d() {

    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {x, y};
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }


    public static void main(String[] args) {

        Point2d point2D = new Point2d(5.7f, 7.87f);
        System.out.println(point2D.toString());
    }
}