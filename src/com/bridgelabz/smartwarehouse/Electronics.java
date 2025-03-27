package com.bridgelabz.smartwarehouse;

public class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + getName() + " | Brand: " + brand + " | Price: $" + getPrice());
    }
}
