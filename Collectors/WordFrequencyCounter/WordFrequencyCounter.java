import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "hello world hello Java Java world";
        List<String> words = Arrays.asList(paragraph.split("\\s+"));

        Map<String, Integer> frequencyMap = words.stream()
            .collect(Collectors.toMap(Function.identity(), w -> 1, Integer::sum));

        System.out.println(frequencyMap);
    }
}
