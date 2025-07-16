import java.util.*;

class Item {
    String name;
    double price;
    int stock;

    Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class Customer {
    String name;
    List<String> items;

    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}

class CheckoutCounter {
    Queue<Customer> queue = new LinkedList<>();
    Map<String, Item> inventory = new HashMap<>();

    void addItemToInventory(String name, double price, int stock) {
        inventory.put(name.toLowerCase(), new Item(name, price, stock));
    }

    void addCustomer(Customer customer) {
        queue.offer(customer);
    }

    void processNextCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = queue.poll();
        double total = 0;
        System.out.println("\nServing customer: " + customer.name);
        for (String itemName : customer.items) {
            Item item = inventory.get(itemName.toLowerCase());
            if (item == null) {
                System.out.println("Item not found: " + itemName);
                continue;
            }
            if (item.stock <= 0) {
                System.out.println("Out of stock: " + itemName);
                continue;
            }
            total += item.price;
            item.stock--;
            System.out.println("  - Bought: " + item.name + " ₹" + item.price);
        }
        System.out.println("Total Bill: ₹" + total);
    }

    void showInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Item item : inventory.values()) {
            System.out.println(item.name + " - ₹" + item.price + " | Stock: " + item.stock);
        }
    }
}

public class SmartCheckout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckoutCounter counter = new CheckoutCounter();

        System.out.println("=== Add Items to Inventory ===");
        System.out.print("How many items to add? ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Item name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.print("Stock: ");
            int stock = Integer.parseInt(sc.nextLine());
            counter.addItemToInventory(name, price, stock);
        }

        System.out.println("\n=== Add Customers to Queue ===");
        System.out.print("How many customers? ");
        int c = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < c; i++) {
            System.out.print("Customer name: ");
            String custName = sc.nextLine();
            System.out.print("How many items for " + custName + "? ");
            int itemCount = Integer.parseInt(sc.nextLine());
            List<String> itemList = new ArrayList<>();
            for (int j = 0; j < itemCount; j++) {
                System.out.print("Item " + (j + 1) + ": ");
                itemList.add(sc.nextLine());
            }
            counter.addCustomer(new Customer(custName, itemList));
        }

        System.out.println("\n=== Processing Customers ===");
        while (true) {
            System.out.print("Process next customer? (yes/no): ");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("yes")) {
                counter.processNextCustomer();
                counter.showInventory();
            } else {
                break;
            }
        }

        sc.close();
        System.out.println("All done. Goodbye!");
    }
}

