package AbstractInterface.animals;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: Gràoooo!";
    }

    @Override
    public String howToEat() {
        return "Ăn thịt của động vật ăn cỏ";
    }

}
