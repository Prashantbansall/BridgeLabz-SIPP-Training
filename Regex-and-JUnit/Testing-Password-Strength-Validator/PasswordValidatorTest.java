import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPasswords() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("Abcdefg9H"));
    }

    @Test
    void testInvalidPasswordsTooShort() {
        assertFalse(validator.isValid("Abc1"));
        assertFalse(validator.isValid("1234567A"));
    }

    @Test
    void testInvalidPasswordsNoUppercase() {
        assertFalse(validator.isValid("password1"));
        assertFalse(validator.isValid("abcd1234"));
    }

    @Test
    void testInvalidPasswordsNoDigit() {
        assertFalse(validator.isValid("Password"));
        assertFalse(validator.isValid("ABCDEFGH"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
