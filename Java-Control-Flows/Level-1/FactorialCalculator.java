package level1ControlFlowPrograms;

import java.util.*;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 0) {
            int factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Enter a non-negative integer");
        }
	}

}
