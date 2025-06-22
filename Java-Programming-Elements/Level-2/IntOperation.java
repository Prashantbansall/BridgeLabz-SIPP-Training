package level2PracticeProblems;

import java.util.*;

public class IntOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter integer value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter integer value for c: ");
        int c = scanner.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = a + c / b;
        int result4 = a % b + c;

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4 + ".");

        scanner.close();
	}

}
