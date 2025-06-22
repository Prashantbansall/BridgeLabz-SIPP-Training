package level2ControlFlowPrograms;
import java.util.Scanner;

public class HarshadNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Get the user input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Loop to find sum of digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        // Check if the original number is divisible by the sum of digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }
	}

}
