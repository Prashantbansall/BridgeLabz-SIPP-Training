import java.util.Scanner;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Take index input
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            // Outer try: Access array element
            try {
                int element = numbers[index];

                // Take divisor input
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                // Inner try: Perform division
                try {
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            sc.close();
        }
    }
}
