package com.bridgelabz.smartwarehouse;

public class Groceries extends WarehouseItem {
    private String expirationDate;

    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Grocery: " + getName() + " | Expiry: " + expirationDate + " | Price: " + getPrice());
    }
}
