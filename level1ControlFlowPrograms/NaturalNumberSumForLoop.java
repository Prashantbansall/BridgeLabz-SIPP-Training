package level1ControlFlowPrograms;

import java.util.*;

public class NaturalNumberSumForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        long n;

        while (true) {
            System.out.print("Enter a natural number (n): ");
            if (scanner.hasNextLong()) {
                n = scanner.nextLong();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer (natural number).");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }

        long sumForLoop = 0;
        for (long i = 1; i <= n; i++) {
            sumForLoop += i;
        }

        long sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sumForLoop);
        System.out.println("Sum using formula (n*(n+1)/2): " + sumFormula);

        if (sumForLoop == sumFormula) {
            System.out.println("Both computations resulted in the same correct sum.");
        } else {
            System.out.println("There is a discrepancy between the two computations.");
        }

        scanner.close();
	}

}
