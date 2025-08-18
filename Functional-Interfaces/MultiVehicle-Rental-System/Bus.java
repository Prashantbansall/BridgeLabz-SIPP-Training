public class Bus implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Bus rented successfully.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus returned successfully.");
    }
}
