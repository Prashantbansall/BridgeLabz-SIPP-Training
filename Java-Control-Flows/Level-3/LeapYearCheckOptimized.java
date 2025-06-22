package level3ControlFlowPrograms;
import java.util.Scanner;

public class LeapYearCheckOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Leap Year");
        } else if (year < 1582) {
            System.out.println("Year is before Gregorian calendar");
        } else {
            System.out.println("Not a Leap Year");
        }
	}
}
