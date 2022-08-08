package accessmodifier_static.ClassOley;

public class OStudent {
    private String name = "John";
    private String classes = "C02";


    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public OStudent(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public OStudent(){

    }

    void display() {
        System.out.println(name + " " + classes + " ");
    }
}
