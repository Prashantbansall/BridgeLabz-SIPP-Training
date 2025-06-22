package level1ControlFlowPrograms;

import java.util.Scanner;

public class RocketLaunchForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Lift off!");
	}

}
