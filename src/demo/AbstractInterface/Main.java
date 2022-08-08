package demo.AbstractInterface;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Doggo();
        dog.setName("Bie");
        dog.toString();
        Animal bird = new Bird();
        bird.setName("chim cút");
        bird.toString();
        Animal fish = new Fishe();
        fish.setName("Neemo");
        fish.toString();
        Machine car = new Cars();
        car.setName("GTR-08");
        car.toString();
        Machine airplane = new Airplane();
        airplane.setName("Abus A-320.Neo");
        airplane.toString();
    }
}
