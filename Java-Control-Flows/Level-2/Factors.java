package level2ControlFlowPrograms;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int counter = 1;

        System.out.println("Factors of " + number + ":");
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
	}

}
