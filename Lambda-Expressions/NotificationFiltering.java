import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Medication", "Time to take your medicine"),
            new Alert("Appointment", "Doctor appointment at 3 PM"),
            new Alert("Emergency", "Check patient vitals immediately")
        );

        // User preference: only Emergency alerts
        Predicate<Alert> emergencyOnly = alert -> "Emergency".equals(alert.type);

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(emergencyOnly)
              .forEach(System.out::println);
    }
}
