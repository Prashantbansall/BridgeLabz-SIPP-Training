package level1ControlFlowPrograms;

import java.util.*;

public class RocketCountdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int counter;
        while (true) {
            System.out.print("Enter a number for the countdown: ");
            if (scanner.hasNextInt()) {
                counter = scanner.nextInt();
                if (counter > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        scanner.close();

	}

}
