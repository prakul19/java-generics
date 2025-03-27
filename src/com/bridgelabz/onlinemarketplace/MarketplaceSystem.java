package com.bridgelabz.onlinemarketplace;

public class MarketplaceSystem {
    public static void main(String[] args) {
        // Create different products
        Book book1 = new Book("The Alchemist", 15.99, BookCategory.FICTION, "Paulo Coelho");
        Clothing clothing1 = new Clothing("T-Shirt", 9.99, ClothingCategory.MEN, "L");
        Gadget gadget1 = new Gadget("Smartphone", 699.99, GadgetCategory.SMARTPHONE, "Samsung");

        // Create product catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book1);
        catalog.addProduct(clothing1);
        catalog.addProduct(gadget1);

        // Display all products
        System.out.println("\n--- Product Catalog ---");
        catalog.displayCatalog();

        // Apply discount to products
        System.out.println("\n--- Applying Discounts ---");
        DiscountUtility.applyDiscount(book1, 10);
        DiscountUtility.applyDiscount(clothing1, 15);
        DiscountUtility.applyDiscount(gadget1, 5);

        // Display updated catalog
        System.out.println("\n--- Updated Product Catalog ---");
        catalog.displayCatalog();
    }
}

