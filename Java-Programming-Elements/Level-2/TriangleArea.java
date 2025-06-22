

package level2PracticeProblems;

import java.util.*;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = scanner.nextDouble();

        double areaSqCm = 0.5 * baseCm * heightCm;

        double cmToInch = 2.54;
        double baseInch = baseCm / cmToInch;
        double heightInch = heightCm / cmToInch;
        double areaSqInch = 0.5 * baseInch * heightInch;

        System.out.println("The Area of the triangle in sq in is " + areaSqInch + " and sq cm is " + areaSqCm + ".");

        scanner.close();
	}

}
