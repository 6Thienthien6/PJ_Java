package OOP;

public class std {
    String name;
    int age;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }

    public std(int age) {
    }

    public std(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {

        std l = new std(24);
        l.setName("Kimimaro");
        l.setAge(25);
        l.setGender("Nam");
        System.out.println(l.name);
        System.out.println(l.age);
        System.out.println(l.gender);
    }
}
