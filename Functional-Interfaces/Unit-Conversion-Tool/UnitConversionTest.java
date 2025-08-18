public class UnitConversionTest {
    public static void main(String[] args) {
        double km = 10;
        double kg = 5;
        double celsius = 25;

        System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");
        System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");
        System.out.println(celsius + "°C = " + UnitConverter.celsiusToFahrenheit(celsius) + "°F");
    }
}
