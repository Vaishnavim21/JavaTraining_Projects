package customobj;

import java.util.HashMap;
import java.util.Map;

public class HashMapCustomObject{
    public static void main(String[] args) {
        Map<Integer, Product> productMap = new HashMap<>();

        productMap.put(1, new Product(1, "Laptop", 999.99));
        productMap.put(2, new Product(2, "Phone", 499.99));
        productMap.put(3, new Product(3, "Tablet", 299.99));

        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
