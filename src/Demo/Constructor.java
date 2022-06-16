package Demo;


public class Constructor {
    // Thuộc tính
    String name;
    int age;
    String gender;

    // Constructor có tham số
    public Constructor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Constructor(String name) {
        this.name = name;
    }

    public Constructor(int age) {
        this.age = age;
    }
//     Phương thức
//void display(){
//    System.out.println(name + " "+ age+" "+gender);
//}

    public static void main(String[] args) {
        // Tạo đối tượng
        Constructor s1 = new Constructor("TahmKen", 1111, "nữ");
        Constructor s2 = new Constructor("TahmKenttt", 1111, "nam");
        Constructor s3 = new Constructor("hh", 25);
        Constructor s4 = new Constructor("hi");
        Constructor s5 = new Constructor(25);
        Constructor s6 = new Constructor("Vãn lưu", 111, "nam");
        // Gọi phương thức
//        s1.display();
        System.out.println(s1.name + " " + s1.age + " " + s1.gender);
        System.out.println(s2.name + " " + s2.age + " " + s2.gender);
        System.out.println(s6.name + " " + s6.age + " " + s6.gender);
        System.out.println(s3.name + " " + s3.age);

    }
}





