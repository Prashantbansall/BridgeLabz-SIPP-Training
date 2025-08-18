import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "sample.txt";  // Input file

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Step 1: Read file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Normalize line: lowercase + remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", " ");

                // Split into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error reading file: " + e.getMessage());
            return;
        }

        // Step 2: Sort by frequency (descending order)
        List<Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Step 3: Display top 5 words
        System.out.println("✅ Top 5 most frequently occurring words:");
        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        }
    }
}
