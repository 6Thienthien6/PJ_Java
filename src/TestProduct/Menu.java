package TestProduct;

import java.util.*;

import static TestProduct.ProductManager.*;

public class Menu {
    public static void Adminview() {
        ArrayList<Producttt> list = new ArrayList<>(ProductManager.productList());
        boolean end = true;
        do {
            System.out.println("*=================/*MENU*/====================*");
            System.out.println("1.          Add a product                         ");
            System.out.println("2.          Edit a product                     ");
            System.out.println("3.          Remove product                        ");
            System.out.println("4.          Print a productList                ");
            System.out.println("5.          Find a product by name                ");
            System.out.println("6.          Sort by Price low to high          ");
            System.out.println("7.          Sort by Price high to low             ");
            System.out.println("===============================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    list.add(createANewProduct());
                    break;
                case 2:
                    System.out.println("enter the id be correct: ");
                    int id = scanner.nextInt();
                    int index = 0;
                    for (Producttt product : list) {
                        if (product.getId() == id) {
                            list.set(index, createANewProduct());
                        }
                        index += 1;
                    }
                case 3:
                    System.out.println("enter the id to be deleteee: ");
                    int number = scanner.nextInt();
                    int dele = 0;
                    int thisnumber = 0;
                    for (Producttt delepro : list) {
                        if (delepro.getId() == number) {
                            thisnumber = dele;
                        }
                        dele++;
                    }
                    list.remove(thisnumber);
                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("List is empty!");
                        return;
                    }
                    for (Producttt a : list) {
                        System.out.println(a.toString());
                    }
                    break;
                case 5:
                    System.out.println("enter the name to finding");
                    String name = scanner.nextLine();
                    for (Producttt afind : productList()) {
                        if (afind.getName().equals(name)) {
                            System.out.println(afind.toString());
                        }
                    }
                    break;
                case 6:
                    Collections.sort(list, new Comparator<Producttt>() {
                        @Override
                        public int compare(Producttt o1, Producttt o2) {
                            return (int) (o1.getPrice() - o2.getPrice());
                        }
                    });
                    for (Producttt a : list) {
                        System.out.println(a.toString());
                    }
                    break;
                case 7:
                    Collections.sort(list, new Comparator<Producttt>() {
                        @Override
                        public int compare(Producttt o1, Producttt o2) {
                            return (int) (o2.getPrice() - o1.getPrice());

                        }
                    });
                    for (Producttt a : list) {
                        System.out.println(a.toString());
                    }
                    break;
                default:
                    System.out.println("chose again man: 1,2,3 or 4");
            }
        }
        while (end);
    }
}
