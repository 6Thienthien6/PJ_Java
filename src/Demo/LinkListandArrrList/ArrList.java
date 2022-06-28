package Demo.LinkListandArrrList;

import Demo.AbstractInterface.Animal;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
//        Animal a = animals.get(2);
        animals.add(2, new Animal());
//        animals.remove(1);

        System.out.println("size of arrlist = " + animals.size());
    }

}
