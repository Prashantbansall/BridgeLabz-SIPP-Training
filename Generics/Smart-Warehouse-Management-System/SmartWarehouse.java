// package Generics.Smart-Warehouse-Management-System;

import java.util.*;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " (" + this.getClass().getSimpleName() + ")";
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

class WarehouseUtils {
    static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        while (true) {
            try {
                System.out.println("\n1. Add Item\n2. View Items\n3. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (choice == 1) {
                    System.out.println("Choose category: 1. Electronics 2. Groceries 3. Furniture");
                    int category = scanner.nextInt();
                    scanner.nextLine();

                    if (category < 1 || category > 3) {
                        System.out.println("Invalid category choice. Try again.");
                        continue;
                    }

                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine().trim();

                    if (itemName.isEmpty()) {
                        System.out.println("Item name cannot be empty. Try again.");
                        continue;
                    }

                    switch (category) {
                        case 1 -> electronicsStorage.addItem(new Electronics(itemName));
                        case 2 -> groceriesStorage.addItem(new Groceries(itemName));
                        case 3 -> furnitureStorage.addItem(new Furniture(itemName));
                    }

                    System.out.println("Item added successfully.");

                } else if (choice == 2) {
                    System.out.println("\n--- Stored Items ---");
                    System.out.println("Electronics:");
                    WarehouseUtils.displayItems(electronicsStorage.getItems());

                    System.out.println("\nGroceries:");
                    WarehouseUtils.displayItems(groceriesStorage.getItems());

                    System.out.println("\nFurniture:");
                    WarehouseUtils.displayItems(furnitureStorage.getItems());

                } else if (choice == 3) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid option. Enter 1, 2, or 3.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values only.");
                scanner.nextLine(); // clear buffer
            }
        }

        scanner.close();
    }
}
