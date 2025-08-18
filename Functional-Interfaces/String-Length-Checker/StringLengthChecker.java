import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        String message = "Hello, this is a test message!";
        int limit = 20;

        // Function to get the length of the string
        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(message);
        if (length > limit) {
            System.out.println("Message exceeds the character limit (" + limit + "): " + length + " characters");
        } else {
            System.out.println("Message is within the limit: " + length + " characters");
        }
    }
}
