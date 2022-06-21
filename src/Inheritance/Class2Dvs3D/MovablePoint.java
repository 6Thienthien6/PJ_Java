package Inheritance.Class2Dvs3D;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;
    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y) {
        super(x, y);
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public float[] getSpeed() {
        float[] array = {xSpeed, ySpeed};
        return array;
    }

    public String toString() {
        return Arrays.toString(getSpeed());
    }

    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

}
