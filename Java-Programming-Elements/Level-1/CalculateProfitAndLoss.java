


package operators;

public class CalculateProfitAndLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double costPrice = 129.0;
        double sellingPrice = 191.0;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        
        String formattedProfitPercentage = String.format("%.3f", profitPercentage);


        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + formattedProfitPercentage);
    }
}


