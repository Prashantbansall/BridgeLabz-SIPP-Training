import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagerTest {

    ListManager manager;
    List<Integer> numbers;

    @BeforeEach
    void setup() {
        manager = new ListManager();
        numbers = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        manager.addElement(numbers, 10);
        manager.addElement(numbers, 20);
        assertEquals(2, numbers.size());
        assertTrue(numbers.contains(10));
        assertTrue(numbers.contains(20));
    }

    @Test
    void testRemoveElement() {
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);

        manager.removeElement(numbers, 15);
        assertEquals(2, numbers.size());
        assertFalse(numbers.contains(15));
        assertTrue(numbers.contains(5));
        assertTrue(numbers.contains(25));
    }

    @Test
    void testGetSize() {
        assertEquals(0, manager.getSize(numbers));
        numbers.add(1);
        numbers.add(2);
        assertEquals(2, manager.getSize(numbers));
    }
}
