package operators;
import java.util.Scanner;

public class ConvertDistanceInKilometersToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("kilometers: ");
        double km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
	}

}
