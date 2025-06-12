package level2ControlFlowPrograms;

import java.util.*;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            scanner.close();
            return;
        }

        for (int i = 100; i >= 1; i--) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
	}

}
