package level2PracticeProblems;

import java.util.*;

public class DoubleOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter double value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter double value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter double value for c: ");
        double c = scanner.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = a + c / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4 + ".");

        scanner.close();
	}

}
