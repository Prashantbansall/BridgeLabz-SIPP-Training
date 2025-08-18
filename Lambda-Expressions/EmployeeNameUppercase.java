import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNameUppercase {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Alice", "Bob", "Charlie");

        // Using method reference String::toUpperCase
        List<String> upperNames = employeeNames.stream()
                                               .map(String::toUpperCase)
                                               .toList();

        System.out.println("Uppercase Employee Names:");
        upperNames.forEach(System.out::println);
    }
}
