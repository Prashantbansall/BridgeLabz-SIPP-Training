public class Car implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }

    // uses default displayBattery()
}
