import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("25-08-2025", formatter.formatDate("2025-08-25"));
        assertEquals("01-01-2020", formatter.formatDate("2020-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("25/08/2025");
        });
        assertTrue(exception.getMessage().contains("Invalid date format"));

        exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2025-13-01"); // Invalid month
        });
        assertTrue(exception.getMessage().contains("Invalid date format"));
    }

    @Test
    void testNullDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
        assertTrue(exception.getMessage().contains("Invalid date format"));
    }
}
