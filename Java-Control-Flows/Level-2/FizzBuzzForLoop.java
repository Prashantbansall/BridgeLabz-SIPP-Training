package level2ControlFlowPrograms;

import java.util.Scanner;

public class FizzBuzzForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Enter a positive integer");
        }
	}
}
