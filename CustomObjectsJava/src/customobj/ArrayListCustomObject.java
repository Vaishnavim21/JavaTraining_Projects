package customobj;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCustomObject {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Phone", 499.99));
        products.add(new Product(3, "Tablet", 299.99));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}

