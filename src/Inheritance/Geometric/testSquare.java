package Inheritance.Geometric;

public class testSquare {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq);
        sq = new Square(2.47,"gray", true);
        System.out.println(sq);
        sq = new Square(5.8, "yellow", true);
        System.out.println(sq);
    }
}
