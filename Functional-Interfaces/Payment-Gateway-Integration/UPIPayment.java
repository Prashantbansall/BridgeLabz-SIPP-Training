public class UPIPayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI.");
    }

    // No need to implement refund() unless custom behavior is needed
}
