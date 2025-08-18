public class TaskRunner {

    // Simulates a long-running task
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // Sleep for 3 seconds
        return "Task completed";
    }
}
