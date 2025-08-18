import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();  // Connect before each test
    }

    @AfterEach
    void tearDown() {
        db.disconnect(); // Disconnect after each test
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(db.isConnected(), "Database should be connected before test");
    }

    @Test
    void testConnectionClosed() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected");
    }
}
