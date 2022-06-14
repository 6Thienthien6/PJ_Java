package test;

public class Main {
    int modelYeah;
    String modelName;

    public Main(int year, String Name) {
        modelYeah = year;
        modelName = Name;
    }

    public static void main(String[] args) {
        Main myCar = new Main(1999, "GT-R Nismo");
        System.out.println(myCar.modelYeah + " " + myCar.modelName);
    }
}
