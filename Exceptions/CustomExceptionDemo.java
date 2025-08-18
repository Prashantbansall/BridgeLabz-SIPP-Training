import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("✅ Access granted!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Call validation method
            validateAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("⚠️ Exception: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program ended.");
        }
    }
}
