package level1ControlFlowPrograms;

import java.util.*;

public class LargestNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);

        System.out.println(isFirstLargest);
        System.out.println(isSecondLargest);
        System.out.println(isThirdLargest);

        scanner.close();
	}

}
