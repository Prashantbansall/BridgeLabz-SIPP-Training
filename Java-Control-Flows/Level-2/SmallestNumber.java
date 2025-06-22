package level2ControlFlowPrograms;

import java.util.*;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Is the first number the smallest? " + "Yes");
        } else {
            System.out.println("Is the first number the smallest? " + "No");
        }

        scanner.close();
	}

}
