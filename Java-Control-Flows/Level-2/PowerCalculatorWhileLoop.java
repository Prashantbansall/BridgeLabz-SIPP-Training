package level2ControlFlowPrograms;

import java.util.Scanner;

public class PowerCalculatorWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();

        if (number >= 0 && power >= 0) {
            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println("Result: " + result);
        } else {
            System.out.println("Enter positive integers for number and power");
        }
	}
}
