package Inheritance.Geometric;

public class testRec {
    public static void main(String[] args) {
        Rec re = new Rec();
        System.out.println(re);
        re = new Rec(2.3,2.1);
        System.out.println(re.getPerimeter());
        System.out.println(re.getArea());
        re = new Rec(2.2, 3.2,"orange", true);
        System.out.println(re);
        System.out.println(re.getPerimeter());
        System.out.println(re.getArea());

    }

}
