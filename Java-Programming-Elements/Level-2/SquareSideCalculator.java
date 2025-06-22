package level2PracticeProblems;

import java.util.*;

public class SquareSideCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter + ".");

        scanner.close();
	}

}
