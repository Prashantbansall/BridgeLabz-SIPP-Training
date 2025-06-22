package javaMethods;
import java.util.Scanner;

public class NumberAnalysis {
	
	public static boolean isPositive(int number) {
		return number >= 0;
	}
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static int compare(int number1, int number2) {
		if(number1 > number2) 
			return 1;
		else if(number1 == number2) 
			return 0;
		else 
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for(int i = 0; i < number.length; i++) {
			System.out.print("Number" + (i + 1) + ": ");
			number[i] = sc.nextInt();
		}
		
		for(int i = 0; i < number.length; i++) {
			if(isPositive(number[i])) {
				if(isEven(number[i])) {
					System.out.println(number[i] + " is Positive and Even.");
				} else {
					System.out.println(number[i] + " is Positive and Odd.");
				}
			} else {
				System.out.println(number[i] + " is Negative.");
			}
		}
		
		int result = compare(number[0], number[4]);
		if(result == 0) {
			System.out.println("First and Last elements are equal.");
		}
		else if(result == 1) {
			System.out.println("First element is greater than Last element.");
		}
		else {
			System.out.println("First element is less than Last element.");
		}
	}
}
