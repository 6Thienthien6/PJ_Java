package AbstractInterface;

import AbstractInterface.animals.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof  Chicken){
                Chicken conmeno = (Chicken) animal;
                System.out.println(conmeno.howToEat());
            }
            if (animal instanceof  Tiger){
                Tiger conmeo = (Tiger) animal;
                System.out.println(conmeo.howToEat());
            }
        }
//        for (Animal animal : animals) {
//            System.out.println(animal.makeSound());
//            if (animal instanceof Chicken) {
//                Chicken edibler = (Chicken) animal;
//                System.out.println(edibler.howToEat());
//            }
//        }

        Fruit[] fruits = new Fruit[2];
        fruits [0] = new Apple();
        fruits [1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}



