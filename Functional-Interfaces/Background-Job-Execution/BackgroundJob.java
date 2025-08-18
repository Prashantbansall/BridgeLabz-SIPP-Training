public class BackgroundJob {
    public static void main(String[] args) {
        // Runnable task
        Runnable task = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate task duration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job completed!");
        };

        // Start the task in a new thread
        Thread backgroundThread = new Thread(task);
        backgroundThread.start();

        System.out.println("Main thread continues execution...");
    }
}
