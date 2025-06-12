package operators;

public class FindDiscountedAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fee = 125000;
        int discountPercent = 10;

        int discount = (fee * discountPercent) / 100;
        int finalDiscountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalDiscountedFee);
    }
}


