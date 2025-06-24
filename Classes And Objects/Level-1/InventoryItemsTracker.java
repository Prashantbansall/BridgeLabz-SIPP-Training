package classes.and.objects.level1;
import java.util.*;

class Item{
	int itemCode;
	String itemName;
	double itemPrice;
	
	Item(int itemCode, String itemName, double itemPrice){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	void displayDetails() {
		System.out.println();
		System.out.println("Your item code is: " + itemCode);
		System.out.println("Your item name is: " + itemName);
		System.out.println("Your item price is: " + itemPrice);
	}
	
	void totalCost(int quantity) {
		double total = itemPrice * quantity;
		System.out.println("Your total cost for " + quantity + " " +itemName + " is: " + total); 
	}
}


public class InventoryItemsTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Item Name: ");
        String name = sc.nextLine();
        
        System.out.print("Item Price: ");
        double price = sc.nextDouble();
        
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        
        Item item = new Item(code,name,price);
        
        item.displayDetails();
        item.totalCost(quantity);
	}

}
