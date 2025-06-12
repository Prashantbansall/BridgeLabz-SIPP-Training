package level1ControlFlowPrograms;

import java.util.*;

public class FactorialForLoop {

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

        if (number == 0) {
            factorial = 1; 
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
	}

}
