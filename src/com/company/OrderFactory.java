package com.company;

import java.util.HashMap;
import java.util.Map;

public class OrderFactory {
    private Map<String, Product> productCache = new HashMap<String, Product>();

    public Product lookup(String productName) {
        Product product = productCache.get(productName);
        if(product == null) {
            product = new Product(productName);
            productCache.put(productName, product);
        }
        return product;
    }

    public int totalProductsMade() {
        return productCache.size();
    }
}
