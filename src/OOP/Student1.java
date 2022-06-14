package OOP;

public class Student1 {
    int id;
    String name;
    int year;
    String gender;
    public void setGender(String gender) {
        this.gender = gender;
    }
    void Student1(String gender){
    this.gender= gender;
    }
    void Student1(int year) {
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    void Student1(int id, String name) {
        this.year = year;
        this.id = id;
        this.name = name;
        System.out.println(id + " " + name + " " + year+" "+ gender);
    }
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Student1 s3 = new Student1();
        s1.setYear(2001);
        s2.setYear(2000);
       s3.setYear(2001);
        s1.setGender("LGBT");
        s2.setGender("Nam");
        s3.setGender("Asian");
        s1.Student1(1, "tao ne:");
        s2.Student1(2, "may la ai:");
        s3.Student1(3, "Emotional Damage");
    }
}
