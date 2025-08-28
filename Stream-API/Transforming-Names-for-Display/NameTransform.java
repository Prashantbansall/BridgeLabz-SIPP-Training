import java.util.*;
import java.util.stream.Collectors;

public class NameTransform {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "bob", "charlie", "dave", "Edward");

        List<String> displayNames = names.stream()
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        displayNames.forEach(System.out::println);
    }
}
