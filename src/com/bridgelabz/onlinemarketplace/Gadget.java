package com.bridgelabz.onlinemarketplace;

public class Gadget extends Product<GadgetCategory> {
    private String brand;

    public Gadget(String name, double price, GadgetCategory category, String brand) {
        super(name, price, category);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Gadget: " + getName() + " | Brand: " + brand +
                " | Category: " + getCategory() + " | Price: $" + getPrice());
    }
}

