package this_static_final_keywords_and_instanceof_operator;

class Product {
    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Name: " + p.productName);
            System.out.println("Price: " + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class ShoppingCartSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(1, "Laptop", 50000, 2);
        Product p2 = new Product(2, "Mouse", 500, 5);

        p1.displayDetails(p1);
        p2.displayDetails(p2);

        Product.updateDiscount(15.0);

        p1.displayDetails(p1);
        p2.displayDetails(p2);
	}

}
