package AccessModifier_Static.StaticMethod;

public class Student1 {
    private int roll;
    private String name;
    private static String college;

    static void change() {
        college = "Hue Academy of music";
    }

    Student1(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}
