package AccessModifier_Static.StaticMethod;

import AccessModifier_Static.StaticMethod.Student1;

public class testStaticMethod {
    public static void main(String[] args) {
        Student1.change();
        Student1 st1 = new Student1(1, "Tuấn");
        Student1 st2 = new Student1(2, "Nhật");
        Student1 st3 = new Student1(3, "Dũng");
        Student1 st4 = new Student1(4, "Lĩnh");
        st1.display();
        st2.display();
        st3.display();
        st4.display();
    }
}
