package collectionframework.sp.view;

import collectionframework.sp.model.Product;
import collectionframework.sp.service.IProductService;
import collectionframework.sp.service.ProductService;

import java.util.Scanner;

public class ProductView{
    IProductService productService = new ProductService();
    public Scanner scanner = new Scanner(System.in);
    private String name;
    public void addProduct(){
        System.out.println("nhập id: ");
        int id =Integer.parseInt(scanner.nextLine());
        if(productService.existById(id)){
            System.out.println("id đã tồn tại");

        }else {
            System.out.println("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm:");
            double price = scanner.nextDouble();
            Product product = new Product(id,name, price);
            productService.add(product);
        }
    }
    public void updateProduct(){
        System.out.println("Nhập id cần sửa: ");
        System.out.println("Nhập id cần thay đổi: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)){
            System.out.println("Cập nhật tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("Cập giá sản phẩm:");
            double price = scanner.nextDouble();
            Product product = new Product(id,name, price);
            productService.update(product);
            System.out.println("Cập nhật thành công!");
        }else {
            System.out.println("Sản phẩm không có !!!");
        }
    }
}


