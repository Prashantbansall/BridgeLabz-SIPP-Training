import java.util.*;

public class AttendeeWelcome {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Prashant", "Amit", "Sonia");

        attendees.forEach(name -> System.out.println("Welcome, " + name + "!"));
    }
}
