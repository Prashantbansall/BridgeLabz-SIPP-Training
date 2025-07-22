// package Generics.Dynamic-Online-Marketplace;

import java.util.*;

interface ProductCategory {
    String getCategoryName();

    double getMinPrice();

    double getMaxPrice();
}

class BookCategory implements ProductCategory {
    public String getCategoryName() {
        return "Books";
    }

    public double getMinPrice() {
        return 100;
    }

    public double getMaxPrice() {
        return 1000;
    }
}

class ClothingCategory implements ProductCategory {
    public String getCategoryName() {
        return "Clothing";
    }

    public double getMinPrice() {
        return 200;
    }

    public double getMaxPrice() {
        return 5000;
    }
}

class GadgetCategory implements ProductCategory {
    public String getCategoryName() {
        return "Gadgets";
    }

    public double getMinPrice() {
        return 500;
    }

    public double getMaxPrice() {
        return 20000;
    }
}

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        if (price < category.getMinPrice() || price > category.getMaxPrice()) {
            throw new IllegalArgumentException("Price must be within " + category.getCategoryName() +
                    " range (" + category.getMinPrice() + " - " + category.getMaxPrice() + ")");
        }
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public String toString() {
        return name + " | Category: " + category.getCategoryName() + " | Price: ₹" + price;
    }
}

class DiscountUtils {
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {
        product.applyDiscount(percentage);
    }
}

public class OnlineMarketplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product<? extends ProductCategory>> catalog = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Product\n2. View Catalog\n3. Apply Discount\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice;

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            if (choice == 1) {
                System.out.println("Select Category: 1. Book  2. Clothing  3. Gadget");
                int catChoice = scanner.nextInt();
                scanner.nextLine();

                ProductCategory category;

                switch (catChoice) {
                    case 1 -> category = new BookCategory();
                    case 2 -> category = new ClothingCategory();
                    case 3 -> category = new GadgetCategory();
                    default -> {
                        System.out.println("Invalid category.");
                        continue; // 
                    }
                }

                System.out.print("Enter product name: ");
                String name = scanner.nextLine();

                System.out.print("Enter price: ");
                double price;
                try {
                    price = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid price. Must be a number.");
                    scanner.nextLine();
                    continue;
                }

                try {
                    if (category instanceof BookCategory bookCat) {
                        catalog.add(new Product<>(name, price, bookCat));
                    } else if (category instanceof ClothingCategory clothingCat) {
                        catalog.add(new Product<>(name, price, clothingCat));
                    } else if (category instanceof GadgetCategory gadgetCat) {
                        catalog.add(new Product<>(name, price, gadgetCat));
                    }
                    System.out.println("Product added successfully.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else if (choice == 2) {
                System.out.println("\n--- Product Catalog ---");
                for (Product<? extends ProductCategory> p : catalog) {
                    System.out.println(p);
                }

            } else if (choice == 3) {
                if (catalog.isEmpty()) {
                    System.out.println("Catalog is empty.");
                    continue;
                }

                System.out.println("Select product to apply discount:");
                for (int i = 0; i < catalog.size(); i++) {
                    System.out.println((i + 1) + ". " + catalog.get(i).getName());
                }

                int index = scanner.nextInt() - 1;
                scanner.nextLine();

                if (index < 0 || index >= catalog.size()) {
                    System.out.println("Invalid product selection.");
                    continue;
                }

                System.out.print("Enter discount percentage: ");
                double discount;
                try {
                    discount = scanner.nextDouble();
                    if (discount < 0 || discount > 100) {
                        System.out.println("Invalid discount. Must be 0–100.");
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid percentage.");
                    scanner.nextLine();
                    continue;
                }

                Product<?> selectedProduct = catalog.get(index);
                applyDiscountGeneric(selectedProduct, discount);
                System.out.println("Discount applied.");

            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    // Apply discount using wildcard capture helper
    private static void applyDiscountGeneric(Product<?> product, double percent) {
        applyDiscountHelper(product, percent);
    }

    private static <T extends ProductCategory> void applyDiscountHelper(Product<T> product, double percent) {
        DiscountUtils.applyDiscount(product, percent);
    }
}
