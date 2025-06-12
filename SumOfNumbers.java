package level1ControlFlowPrograms;

import java.util.*;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double inputNum;

        System.out.println("Enter numbers to sum. Enter 0 to finish.");

        do {
            System.out.print("Enter a number: ");
            if (scanner.hasNextDouble()) {
                inputNum = scanner.nextDouble();
                total += inputNum;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
                inputNum = -1.0; 
            }
        } while (inputNum != 0.0);

        System.out.println("The total sum is: " + total);
        scanner.close();
	}

}
