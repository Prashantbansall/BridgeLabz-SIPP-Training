import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        // Original map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Inverted map
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // If value already exists, append to list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        // Print results
        System.out.println("Original Map: " + originalMap);
        System.out.println("Inverted Map: " + invertedMap);
    }
}
