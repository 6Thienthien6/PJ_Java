package abstractInterface.animals;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuk cak!";
    }

    @Override
    public String howToEat() {
        return "Chicken could be Fried(ăn lúa)";
    }
}

