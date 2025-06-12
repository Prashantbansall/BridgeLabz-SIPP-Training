package level1ControlFlowPrograms;

import java.util.*;

public class SumNumbersWithBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to sum. Enter 0 or a negative number to finish.");

        while (true) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextDouble()) {
                double inputNum = scanner.nextDouble();
                if (inputNum <= 0) {
                    break; 
                }
                total += inputNum;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }

        System.out.println("The total sum is: " + total);
        scanner.close();
	}

}
