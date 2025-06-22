package level2ControlFlowPrograms;
import java.util.Scanner;

public class MultiplesBelow100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a positive number less than 100.");
            return;
        }

        int multiple = number;

        System.out.println("Multiples of " + number + " below 100 are:");

        while (multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }
	}

}
