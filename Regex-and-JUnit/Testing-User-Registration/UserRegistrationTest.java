import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "john@example.com", "Pass123"));
    }

    @Test
    void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "john@example.com", "Pass123");
        });
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("JohnDoe", "johnexample.com", "Pass123");
        });
        assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("JohnDoe", "john@example.com", "123");
        });
        assertEquals("Password must be at least 6 characters", exception.getMessage());
    }
}
