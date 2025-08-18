import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        double currentTemp = 38.5;
        double threshold = 37.5;

        // Predicate to check if temperature exceeds threshold
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert! Temperature exceeds threshold: " + currentTemp + "°C");
        } else {
            System.out.println("Temperature is normal: " + currentTemp + "°C");
        }
    }
}
