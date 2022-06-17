package AccessModifier_Static.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("", "");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("", "");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("", "");
        System.out.println(Car.numberOfCars);
        Car car4 = new Car("","");
        System.out.println(Car.numberOfCars);
        Car car5 = new Car("", "");
        System.out.println(Car.numberOfCars);
//        car1.display();
//        car2.display();
//        car3.display();
//        car4.display();
//        car5.display();
    }
}
