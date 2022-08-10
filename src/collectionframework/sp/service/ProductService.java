package collectionframework.sp.service;

import collectionframework.sp.SortBy.SortByPriceASC;
import collectionframework.sp.SortBy.SortByPriceDESC;
import collectionframework.sp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    public final ArrayList<Product> list;
    private String name;
    public ProductService() {
        this.list = new ArrayList<>();
        list.add(new Product(1, "Nokia", 1500000));
        list.add(new Product(2, "Iphone", 4000000));
        list.add(new Product(3, "SamSung", 3000000));
    }
    @Override
    public List<Product> printAll() {
        list.toString();
        return list;
    }
    @Override
    public void add(Product newProduct) {
        list.add(newProduct);
    }

    @Override
    public void update(Product newProduct) {

        for (Product p : list) {
            if (p.getId() == newProduct.getId()) {
                String name = newProduct.getName();
                if(name!=null && !name.isEmpty())
                    p.setName(name);

                if (newProduct.getPrice() != 0) {
                    double price = newProduct.getPrice();
                    p.setPrice(price);
                }

            }
        }
    }

    @Override
    public boolean existById(int id) {
        return checkById(id) != null;
    }

    @Override
    public Product checkById(int id) {
        for (Product product : list) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                list.remove(i);
            }
        }
    }

    @Override
    public boolean seachByName(String name) {
        this.name = name;
        List<Product> product = new ArrayList<>();
        for (Product pro : list) {
            if (pro.getName().contains(name))
                product.add(pro);
        }
        return false;
    }

    @Override
    public List<Product> findALLByPriceASC() {
        List<Product> sortPriceASC = new ArrayList<>(list);
        sortPriceASC.sort(new SortByPriceASC());
        return sortPriceASC;
    }

    @Override
    public List<Product> findAllByPriceDESC() {
        List<Product> sortPriceDESC = new ArrayList<>(list);
        sortPriceDESC.sort(new SortByPriceDESC());
        return sortPriceDESC;
    }

}
