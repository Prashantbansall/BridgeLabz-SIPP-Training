package operators;

public class VolumeOfEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radiusKm = 6378; 
        double pi = Math.PI;

        double volumeKm3 = (4 / 3) * pi * Math.pow(radiusKm, 3);

        double kmToMiles = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}


