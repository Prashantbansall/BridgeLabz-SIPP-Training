package level2ControlFlowPrograms;

import java.util.Scanner;

public class FactorsFinderWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Enter a positive integer");
        }
	}

}
