import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            
            int result = num / den; // may throw ArithmeticException
            System.out.println("✅ Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Error: Division by zero is not allowed.");
            
        } finally {
            // This block ALWAYS executes
            System.out.println("Operation completed.");
            sc.close();
        }
    }
}
