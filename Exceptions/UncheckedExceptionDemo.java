import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for input
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("✅ Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("⚠️ Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: Please enter numeric values only.");
        } finally {
            scanner.close();
            System.out.println("Scanner closed. Program ended.");
        }
    }
}
