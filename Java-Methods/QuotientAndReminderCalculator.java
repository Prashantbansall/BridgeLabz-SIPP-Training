package javaMethods;
import java.util.Scanner;

public class QuotientAndReminderCalculator {
	
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int[] result = new int[2];
		result[0] = number / divisor;
		result[1] = number % divisor;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int divisor = sc.nextInt();
		int[] finalOutput = findRemainderAndQuotient(number,divisor);
		System.out.println("Quotient: " + finalOutput[0]);
		System.out.println("Remiander: " + finalOutput[1]);
	}
}
