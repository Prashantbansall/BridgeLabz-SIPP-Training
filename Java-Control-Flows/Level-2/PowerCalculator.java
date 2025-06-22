package level2ControlFlowPrograms;
import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result: " + result);
	}

}
