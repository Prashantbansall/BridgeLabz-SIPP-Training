package javaMethods;
import java.util.Scanner;

public class FactorAnalysis {
	
	public static int[] getFactors(int number) {
		int count = 0;
		for(int i =1; i <= number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		
		int[] factors = new int[count];
		int index = 0;
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				factors[index++] = i;
			}
		}
		
		return factors;
	}
	
	public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int factors[] = getFactors(number);
		
		System.out.print("Factors: ");
	    for(int factor : factors) {
	    	System.out.print(factor + " ");
	    }
	    System.out.println();
	    
	    System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Sum of Squares of Factors: " + sumOfSquares(factors));	        
	}
}
