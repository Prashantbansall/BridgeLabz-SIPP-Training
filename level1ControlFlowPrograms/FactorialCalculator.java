package level1ControlFlowPrograms;

import java.util.*;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a non-negative integer to find its factorial: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }

        long factorial = 1;
        int i = 1;

        if (number == 0) {
            factorial = 1;
        } else {
            while (i <= number) {
                factorial *= i;
                i++;
            }
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
	}

}
