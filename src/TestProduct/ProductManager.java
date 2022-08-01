package TestProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ;

    public static ArrayList<Producttt> productList() {
        ArrayList<Producttt> ProductList = new ArrayList<>();
        ProductList.add(new Producttt(1, "capuchino", 28000, 10));
        ProductList.add(new Producttt(2, "Machiato", 31000, 10));
        ProductList.add(new Producttt(3, "Espresso", 26000, 10));
        ProductList.add(new Producttt(4, "Lemonade", 18000, 10));
        ProductList.add(new Producttt(5, "Salt Coffe", 38000, 10));
        ProductList.add(new Producttt(6, "Milk Coffee", 25000, 10));
        return ProductList;
    }

    public static Producttt createANewProduct() {
        Scanner cc = new Scanner(System.in);
        System.out.println("input Product name: ");
        String name = cc.nextLine();
        System.out.println("input Product id: ");
        int id = cc.nextInt();
        System.out.println("input Price: ");
        double price = cc.nextDouble();
        System.out.println("input amount of product: ");
        int amount = cc.nextInt();


        Producttt newProduct = new Producttt(id, name, price, amount);
        productList().add(newProduct);
        showListProduct();
        return newProduct;

    }

    public static void showListProduct() {
        for (Producttt Product : productList()) {
            System.out.println(Product);
        }

    }


}