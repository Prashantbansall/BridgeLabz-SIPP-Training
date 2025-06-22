package javaBuiltInFunction;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date: " + result);
	}

}
