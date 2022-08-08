package CollectionFramework.SP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
//    private final DecimalFormat decimalFormat = new DecimalFormat("###,###,###" + " vnđ");
    private final ArrayList<Product> productList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public ProductManager() {

        Product Iphone = new Product(1, "Iphone X", 17000000);
        Product Iphone1 = new Product(2, "Iphone 11", 20000000);
        Product Iphone2 = new Product(3, "Iphone 12", 23000000);
    }

    public void addProduct() {
        renderProduct();

        System.out.print("■ Type a product id: " );
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("■ Type a product name: ");
        String productName = scanner.nextLine();

        System.out.print("■ Type a product price: ");
        double productPrice = Double.parseDouble(scanner.nextLine());

        productList.add(0, new Product(id , productName, productPrice));

        renderProduct();
        System.out.println("\n■ Product added successfully!");
    }



    //    private boolean isIdInList(int id) {
//            if (!productList.isEmpty()){
//                for (Product product : productList){
//                    if (product.getId() == id) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//            }
//            public boolean isNameInList(String name)  {
//            if (!productList.isEmpty()){
//                for (Product product : productList){
//                    if (product.getName().equalsIgnoreCase(name)){
//                    return true;
//                    }
//                }
//            }
//            return false;
//            }
    public void deleteProduct() {
        renderProduct();

        System.out.print("■ Type a product id to remove: ");
        int productId = Integer.parseInt(scanner.nextLine());

        productList.removeIf(product -> productId == product.getId());

        renderProduct();
        System.out.println("\n■ Product removed successfully!");
    }
    public void editProduct(){
        renderProduct();
        System.out.println("■ Type a product id to edit: ");
        int productId = Integer.parseInt(scanner.nextLine());
        for (Product product : productList){
            if (productId == product.getId()) {
                System.out.println("■ Product: " + product + "\n■ Type a new product id: ");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.printf("■ Type a new product name: ");
                String newProductName = scanner.nextLine();
                System.out.printf("■ Type a new product price: ");
                double newPrice = Double.parseDouble(scanner.nextLine());
                product.setId(newId);
                product.setName(newProductName);
                product.setPrice(newPrice);
                System.out.println("\n■ Product edited successfully! ");
                renderProduct();
            }
        }

    }



//

    public void renderProduct() {
        System.out.printf("\n\t%-16s %-26s %s\n\n", "Product ID", "Product Name", "Product Price");
        for (Product product : productList)
            System.out.printf("\t%-16s %-26s $%.2f\n", product.getId(), product.getName(), product.getPrice());
        System.out.println();
    }

    public void searchProductByName() {
        renderProduct();

        System.out.print("■ Type a product name to search: ");
        String productName = scanner.nextLine().toLowerCase();
        int flag = 0;

        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(productName)) {
                System.out.printf("\t%-16s %-26s $%.2f\n", product.getId(), product.getName(), product.getPrice());
                flag++;
            }
        }

        if (flag == 0) System.out.println("■ Product not found!");
    }

    public void sortByPriceASC() {
        ArrayList<Product> products = new ArrayList<>(productList);
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o1.getPrice() - o2.getPrice();
                return result == 0 ? 0 : (result > 0 ? 1 : -1);
            }
        });
        renderProduct(products);
    }

    public void sortByPriceDESC() {
        ArrayList<Product> products = new ArrayList<>(productList);
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o2.getPrice() - o1.getPrice();
                return result == 0 ? 0 : (result > 0 ? 1 : -1);
            }
        });
        renderProduct(products);
    }
    public void renderProduct(List<Product> products) {
        System.out.printf("\n\t%-16s  %-26s %s\n\n", "Product ID", "Product Name", "Product Price");
        for (Product product : products)
            System.out.printf("\t%-16s  %-26s $%.2f\n", product.getPrice(), product.getName(), product.getPrice());
    }

}


