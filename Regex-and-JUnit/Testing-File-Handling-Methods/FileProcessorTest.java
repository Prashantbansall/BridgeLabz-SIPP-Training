import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String filename = "testfile.txt";
    String content = "Hello, JUnit testing!";

    @Test
    void testWriteAndReadFile() throws IOException {
        // Write to file
        processor.writeToFile(filename, content);

        // Check if file exists
        File file = new File(filename);
        assertTrue(file.exists(), "File should exist after writing");

        // Read from file and check content
        String readContent = processor.readFromFile(filename);
        assertEquals(content, readContent);
    }

    @Test
    void testReadNonExistingFile() {
        // Attempt to read a file that does not exist
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nonexistentfile.txt");
        });
    }
}
