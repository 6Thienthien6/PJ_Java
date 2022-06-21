package Inheritance.Class2Dvs3D;

public class testMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(99.6f, 6.66f, 5.3f, 7.35f);
        System.out.println(movablePoint);
        System.out.println(movablePoint.getX());
        System.out.println(movablePoint.move().getX());
    }
}
