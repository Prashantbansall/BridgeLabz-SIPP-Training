import java.util.*;
import java.util.stream.Collectors;

class Doctor {
    String name;
    String specialty;
    boolean availableWeekend;
    Doctor(String name, String specialty, boolean availableWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableWeekend = availableWeekend;
    }
}

public class WeekendDoctors {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Lee", "Neurology", false),
            new Doctor("Dr. Chen", "Orthopedics", true),
            new Doctor("Dr. Gupta", "Dermatology", true)
        );

        List<Doctor> available = doctors.stream()
            .filter(d -> d.availableWeekend)
            .sorted(Comparator.comparing(d -> d.specialty))
            .collect(Collectors.toList());

        available.forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}
