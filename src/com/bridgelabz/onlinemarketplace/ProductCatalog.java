package com.bridgelabz.onlinemarketplace;
import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (Product<?> product : products) {
            product.displayInfo();
        }
    }
}
