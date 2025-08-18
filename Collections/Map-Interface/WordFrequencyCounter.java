import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Sample text (replace with file reading if needed)
        String text = "Hello world, hello Java!";

        // Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        // Split into words
        String[] words = text.split("\\s+");

        // Use HashMap to count frequency
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Print result
        System.out.println(wordCount);
    }
}
