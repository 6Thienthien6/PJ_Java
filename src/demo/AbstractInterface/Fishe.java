package demo.AbstractInterface;
public class Fishe extends Animal implements Swimable {

    public void setName(String name) {
        super.setName(name);
    }


    public void swim() {
        System.out.println(getName() + " can swim under water");
    }

    @Override
    public String toString() {
        System.out.println( getName() + " is a Fish.");
        swim();
        return super.toString();
    }
}
