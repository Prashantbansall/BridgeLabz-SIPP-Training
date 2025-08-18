public interface PaymentProcessor {
    void pay(double amount);

    // Default refund method
    default void refund(double amount) {
        System.out.println("Refunded " + amount + " via generic processor.");
    }
}
