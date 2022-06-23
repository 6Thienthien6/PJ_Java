package TestCP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("fai",22));
        studentList.add(new Student("eewd", 223));
        studentList.add(new Student("abeff", 21));

        Collections.sort(studentList);

        for (Student student : studentList){
            System.out.println(student);
        }
    }
}
