import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionCalculatorTest {

    ExceptionCalculator calculator = new ExceptionCalculator();

    @Test
    void testDivide() {
        // Normal division
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        // Test if ArithmeticException is thrown
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
