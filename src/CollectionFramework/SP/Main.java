package CollectionFramework.SP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
//        try{
        boolean end=true;
        int choice;

        do {
            System.out.println(" Menu ");
            System.out.println(" [1] Product List - Shows all current product from the Product List. ");
            System.out.println(" [2] Product Add - Adding a new product to the Product List. ");
            System.out.println(" [3] Product Edit - Editing a product from Product List. ");
            System.out.println(" [4] Product Remove - Removing a product from Product List. ");
            System.out.println(" [5] Product Search - Searching a product from Product List. ");
            System.out.println(" [6] Product Sort (Ascending Price) - Sorting product by ascending price. ");
            System.out.println(" [7] Product Sort (Descending Price) - Sorting product by descending price. ");
            System.out.println(" [8] Exit the application. ");
            System.out.println("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    productManager.renderProduct();
                    break;

                case 2:
                    productManager.addProduct();
                    break;

                case 3:
                    productManager.editProduct();
                    break;

                case 4:
                    productManager.deleteProduct();
                    break;

                case 5:
                    productManager.searchProductByName();
                    break;

                case 6:
                    productManager.sortByPriceASC();
                    break;

                case 7:
                    productManager.sortByPriceDESC();
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("■ Invalid selected number, please try again!");
                    end =false;
            }

        }
        while (end);

//    } catch (
//    InputMismatchException io) {
//        io.printStackTrace();
//    } catch (Exception e) {
//        e.getStackTrace();
    }

    }


