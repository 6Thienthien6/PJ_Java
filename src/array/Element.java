import java.util.Scanner;
public class Element {
    public static void main(String[] args) {


     String[] students;
        students = new String[]{"Christian", "Michael", "Camila", "Senna", "Taliya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily","Renekton"};
        Scanner scanner = new Scanner(System.in);
System.out.print("nhập tên học sinh:");
    String input_name = scanner.nextLine();
    boolean isExist = false;
for (int i = 0; i < students.length; i++) {
        if (students[i].equals(input_name)) {
            System.out.println("Ví trí của học sinh trong danh sách " + input_name + " is: " + i);
            isExist = true;
            break;
        }
    }
if (!isExist) {
        System.out.println("không tìm thấy" + input_name + " trong danh sách.");
    }
}
}