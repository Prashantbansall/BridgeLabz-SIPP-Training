import java.util.*;

public class ElementFrequency {

    // Method to find frequency of elements
    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        // Example input
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

        System.out.println("Input List: " + items);
        Map<String, Integer> result = findFrequency(items);
        System.out.println("Frequency Map: " + result);
    }
}
