package level1ControlFlowPrograms;

import java.util.*;

public class SmallestNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean isFirstSmallest = (number1 <= number2) && (number1 <= number3);

        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        scanner.close();
	}

}
