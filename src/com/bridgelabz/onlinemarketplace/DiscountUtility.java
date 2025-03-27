package com.bridgelabz.onlinemarketplace;

public class DiscountUtility {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        double newPrice = product.getPrice() - discountAmount;
        product.setPrice(newPrice);
        System.out.println("Discount applied! New price of " + product.getName() + ": $" + newPrice);
    }
}
