package javaBuiltInFunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(currentDate.format(format1));
        System.out.println(currentDate.format(format2));
        System.out.println(currentDate.format(format3));
	}

}
