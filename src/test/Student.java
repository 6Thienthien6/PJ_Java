package test;

public class Student {
    int id; //instance variable

    String name;
    static String college = "Trường ICT Huế";//static variable
    //constructor
    public Student(int i, String n) {
        id = i;
        name = n;

    }


    // Phương thức để hiển thị thông tin sinh viên

    void display() {

        System.out.println(id + " " + name + " " + college );

    }
// Tạo class khác để thực hiện hiển thị dữ liệu

    public static void main(String args[]) {

        Student s1 = new Student(17, "Hải");

        Student s2 = new Student(18, "Doanh");

        // Chúng ta có thể thay đổi trường đại học của tất cả sv bằng 1 dòng code



        s1.display();

        s2.display();

    }
}



