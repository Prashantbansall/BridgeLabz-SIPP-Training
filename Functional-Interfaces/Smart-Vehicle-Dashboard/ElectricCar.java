public class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 100 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery level: 85%");
    }
}
