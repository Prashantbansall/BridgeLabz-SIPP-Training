import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Example array (you can change it or set it to null to test NullPointerException)
            int[] numbers = {10, 20, 30, 40, 50};
            // int[] numbers = null;  // Uncomment to test NullPointerException

            System.out.print("Enter index number: ");
            int index = scanner.nextInt();

            // Access array element
            int value = numbers[index];
            System.out.println("✅ Value at index " + index + ": " + value);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Invalid index!");
        } 
        catch (NullPointerException e) {
            System.out.println("⚠️ Array is not initialized!");
        } 
        finally {
            scanner.close();
            System.out.println("Program ended.");
        }
    }
}
