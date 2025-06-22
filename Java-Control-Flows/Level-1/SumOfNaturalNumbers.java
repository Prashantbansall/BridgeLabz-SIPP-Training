package level1ControlFlowPrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("There is a mismatch in the results");
            }
        } else {
            System.out.println("Enter a natural number greater than 0");
        }
	}

}
