package OOP;

import java.time.LocalDate;

public class Student {
    int id = 1;
    String name = "Thienthy";
    String gendar = "Nữ";
    LocalDate year = LocalDate.of(2020,12,25);

    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("ID: " + student1.id);
        System.out.println(student1.name);
        System.out.println(student1.gendar);
        System.out.println(student1.year);
    }


}

