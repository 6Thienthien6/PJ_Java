package Inheritance.Class2Dvs3D;

import java.util.Arrays;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public Point3d() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float [] array = {getX(),getY(),z};
        return array;
    }
    public String toString(){
        return Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3d point3D= new Point3d(5.2f,8.98f,442.6f);
        System.out.println(point3D.toString());
    }
}
