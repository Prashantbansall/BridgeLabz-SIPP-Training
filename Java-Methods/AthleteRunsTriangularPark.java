package javaMethods;
import java.util.Scanner;

public class AthleteRunsTriangularPark {
	
	public static double calculateRounds(double side1, double side2, double side3) {
		double perimeter = side1 + side2 + side3;
		return 5000 / perimeter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Side1(in meters): ");
		double side1 = sc.nextDouble();
		System.out.print("Side2(in meters): ");
		double side2 = sc.nextDouble();
		System.out.print("Side3(in meters): ");
		double side3 = sc.nextDouble();
		double rounds = (int)calculateRounds(side1, side2, side3);
		System.out.println("Rounds Needed: " + rounds);
	}
}
