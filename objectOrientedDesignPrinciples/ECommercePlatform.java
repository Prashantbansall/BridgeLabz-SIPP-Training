package objectOrientedDesignPrinciples;
import java.util.ArrayList;

import java.util.ArrayList;

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println(productName + " - $" + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.display();
        }
    }
}

class ShopCustomer {
    String name;
    ArrayList<Order> orders;

    ShopCustomer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
    }

    void showCustomerOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}


public class ECommercePlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopCustomer c1 = new ShopCustomer("Alice");

        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Mouse", 25.0);
        Product p3 = new Product("Keyboard", 45.0);

        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102);
        order2.addProduct(p3);

        c1.placeOrder(order1);
        c1.placeOrder(order2);

        c1.showCustomerOrders();
	}

}
