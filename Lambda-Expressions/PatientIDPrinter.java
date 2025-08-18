import java.util.*;

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P101", "P102", "P103", "P104");

        // Using method reference to print each ID
        System.out.println("Patient IDs:");
        patientIDs.forEach(System.out::println);
    }
}
