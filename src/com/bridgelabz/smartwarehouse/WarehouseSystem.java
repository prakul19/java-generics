package com.bridgelabz.smartwarehouse;

public class WarehouseSystem {
    public static void main(String[] args) {
        // Storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 999, "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", 699, "Samsung"));

        // Storage for Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", 2, "2025-01-01"));
        groceriesStorage.addItem(new Groceries("Bread", 1, "2024-12-15"));

        // Storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 49, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 129, "Metal"));

        // Display each storage type
        System.out.println("\nElectronics Storage ");
        electronicsStorage.displayItems();

        System.out.println("\nGroceries Storage ");
        groceriesStorage.displayItems();

        System.out.println("\nFurniture Storage ");
        furnitureStorage.displayItems();

        // Use wildcard method to display any type of WarehouseItem
        System.out.println("\nDisplay All Items (Wildcard Method)");
        StorageUtility.displayItems(electronicsStorage.getItems());
        StorageUtility.displayItems(groceriesStorage.getItems());
        StorageUtility.displayItems(furnitureStorage.getItems());
    }
}
