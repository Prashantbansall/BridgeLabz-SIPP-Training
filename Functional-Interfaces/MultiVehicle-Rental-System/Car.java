public class Car implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Car rented successfully.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car returned successfully.");
    }
}
