package classes.and.objects.level1;
import java.util.*;

class MobilePhone{
	String brand;
	String model;
	double price;
	
	MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void displayDetails() {
		System.out.println();
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
	}
}

public class MobilePhoneDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your mobile phone brand: ");
		String brand = sc.nextLine();
		
		System.out.print("Enter your mobile phone model: ");
		String model = sc.nextLine();
		
		System.out.print("Enter your mobile phone price: ");
		double price = sc.nextDouble();
		
		MobilePhone phone = new MobilePhone(brand,model,price);
		phone.displayDetails();
	}

}
