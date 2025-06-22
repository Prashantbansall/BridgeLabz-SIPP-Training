


package operators;

import java.util.*;

public class FindDiscountedAmountThroughUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalDiscountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalDiscountedFee);

        input.close();
	}

}
