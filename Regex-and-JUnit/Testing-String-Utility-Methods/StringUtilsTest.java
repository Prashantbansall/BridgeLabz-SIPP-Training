import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
        assertEquals("cba", utils.reverse("abc"));
        assertNull(utils.reverse(null));  // null safety test
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("RaceCar"));  // case-insensitive check
        assertFalse(utils.isPalindrome("hello"));
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertEquals("JAVA", utils.toUpperCase("java"));
        assertNull(utils.toUpperCase(null)); // null safety test
    }
}
