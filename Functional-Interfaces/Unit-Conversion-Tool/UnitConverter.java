public interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
