package array;

import java.util.Scanner;

public class thaydoiNhietdo {
    //Tạo phương thức main() để thực thi ứng dụng.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
//Sử dụng vòng lặp do/while và cấu trúc lựa chọn switch/case để hiển in ra menu lựa chọn cho người dùng.
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                //Gọi phương thức chuyển từ độ F sang độ C khi người dùng lựa chọn 1
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ C là: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                //Gọi phương thức chuyển từ độ C sang độ F khi người dùng lựa chọn 2
                case 2: {
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.printf("Độ F là: %.1f", celsiusToFahrenheit(celsius));
                    System.out.println();
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    //Xây dựng phương thức chuyển đổi từ độ C sang độ F
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    //Xây dựng phương thức chuyển đổi từ độ F sang độ C
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
