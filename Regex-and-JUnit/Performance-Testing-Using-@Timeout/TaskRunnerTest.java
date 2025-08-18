import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class TaskRunnerTest {

    TaskRunner taskRunner = new TaskRunner();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)  // Fail if exceeds 2 seconds
    void testLongRunningTask() throws InterruptedException {
        String result = taskRunner.longRunningTask();
        assertEquals("Task completed", result);
    }
}
