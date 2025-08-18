public class ThrowThrowsDemo {

    // Method that propagates exception using 'throws'
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            // 'throw' is used to explicitly throw an exception
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            double interest = calculateInterest(10000, 5, 2); // valid input
            System.out.println("✅ Calculated Interest: " + interest);

            // Invalid case: negative amount
            double invalidInterest = calculateInterest(-5000, 5, 2);
            System.out.println("Interest: " + invalidInterest);

        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Invalid input: " + e.getMessage());
        }
    }
}
