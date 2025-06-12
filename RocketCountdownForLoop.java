package level1ControlFlowPrograms;

import java.util.*;

public class RocketCountdownForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int startNumber;
        while (true) {
            System.out.print("Enter a number for the countdown: ");
            if (scanner.hasNextInt()) {
                startNumber = scanner.nextInt();
                if (startNumber > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }
        
        for (int i = startNumber; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
	}

}
