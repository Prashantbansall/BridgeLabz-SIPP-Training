package classes.and.objects.level1;

import java.util.*;

class Circle{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	void display() {
		System.out.printf("Area of a Circle: %.2f\n", getArea());
		System.out.printf("Circumference of a Circle: %.2f\n", getCircumference());
	}
	
}

public class AreaOfCircle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of a circle(cm): ");
		double radius = sc.nextDouble();
		Circle cr = new Circle(radius);
		cr.display();
	}

}
