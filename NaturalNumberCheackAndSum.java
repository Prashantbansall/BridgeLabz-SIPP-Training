package level1ControlFlowPrograms;

import java.util.*;

public class NaturalNumberCheackAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 0) {
            long sum = (long) number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        scanner.close();
	}

}
