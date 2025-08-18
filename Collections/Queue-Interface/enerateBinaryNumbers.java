import java.util.*;

public class GenerateBinaryNumbers {

    // Function to generate first N binary numbers
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        // Start with "1"
        queue.add("1");

        for (int i = 0; i < n; i++) {
            // Get the front element of queue
            String current = queue.remove();
            result.add(current);

            // Append "0" and "1" to the current and enqueue
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;  // Example input
        List<String> binaryNumbers = generateBinaryNumbers(n);

        System.out.println("First " + n + " Binary Numbers: " + binaryNumbers);
    }
}
