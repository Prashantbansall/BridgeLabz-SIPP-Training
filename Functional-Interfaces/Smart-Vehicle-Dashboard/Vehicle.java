public interface Vehicle {
    void displaySpeed();

    // Default method for battery percentage (can be overridden by EVs)
    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle.");
    }
}
