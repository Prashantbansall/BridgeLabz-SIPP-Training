package javaMethods;
import java.util.Scanner;

public class QuadraticEquation {
	
	public static double[] findRoots(double a, double b, double c) {
		double delta = Math.pow(b,2) - 4 * a * c;
		if(delta > 0) {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			return new double[]{root1, root2};
		}
		else if(delta == 0) {
			double root = -b / (2 * a);
			return new double[] {root};
		}
		else {
			return new double[0];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		double a = sc.nextDouble();
		System.out.print("b: ");
		double b = sc.nextDouble();
		System.out.print("c: ");
		double c = sc.nextDouble();
		double[] roots = findRoots(a,b,c);
		if(roots.length == 2) {
			System.out.println("Double Roots:");
			System.out.println("    Root 1: " + roots[0]);
			System.out.println("    Root 2: " + roots[1]);
		} else if(roots.length == 1) {
			System.out.println("Single Root: " + roots[0]);
		} else {
			System.out.println("No Real Roots");
		}
	}
}
