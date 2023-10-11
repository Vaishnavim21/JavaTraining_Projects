package customobj;

import java.util.HashSet;
import java.util.Set;

public class HashSetCustomObject {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();

        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Phone", 499.99));
        products.add(new Product(3, "Tablet", 299.99));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}

