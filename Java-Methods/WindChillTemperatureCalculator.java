package javaMethods;
import java.util.Scanner;

public class WindChillTemperatureCalculator {
	
	public static double calculateWindChill(double temperature, double windSpeed) {
		return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in celcius: ");
		double temperature = sc.nextDouble();
		System.out.print("Enter wind speed in miles per hour(mph): ");
		double windSpeed = sc.nextDouble();
		double windChill = calculateWindChill(temperature, windSpeed);
		System.out.println("Wind Chill Temperatue: " + windChill);
	}
}
