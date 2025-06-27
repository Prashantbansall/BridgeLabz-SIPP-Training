package this_static_final_keywords_and_instanceof_operator;

class Vehicle {
    static double registrationFee = 500.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class VehicleRegistrationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("MH12AB1234", "Alice", "Car");
        Vehicle v2 = new Vehicle("DL5CN9876", "Bob", "Bike");

        v1.displayDetails(v1);
        v2.displayDetails(v2);

        Vehicle.updateRegistrationFee(600.0);

        v1.displayDetails(v1);
        v2.displayDetails(v2);
	}

}
