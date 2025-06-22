package level1ControlFlowPrograms;

import java.util.Scanner;

public class FactorialCalculatorForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 0) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Enter a non-negative integer");
        }
	}

}
