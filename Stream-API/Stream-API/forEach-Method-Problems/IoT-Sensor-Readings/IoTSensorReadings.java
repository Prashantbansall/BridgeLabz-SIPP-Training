import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(70.5, 49.0, 85.1, 60.3);
        double threshold = 60.0;

        readings.stream()
            .filter(r -> r > threshold)
            .forEach(r -> System.out.println("High Reading: " + r));
    }
}
