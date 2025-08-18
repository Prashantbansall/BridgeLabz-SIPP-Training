import java.io.*;

public class PipedStreamDemo {
    public static void main(String[] args) {
        try {
            // Create piped input and output streams
            final PipedOutputStream pos = new PipedOutputStream();
            final PipedInputStream pis = new PipedInputStream(pos);

            // Writer Thread
            Thread writerThread = new Thread(() -> {
                try (DataOutputStream dos = new DataOutputStream(pos)) {
                    String[] messages = {
                        "Hello from Writer!",
                        "Piped streams are cool!",
                        "This is inter-thread communication.",
                        "END"
                    };

                    for (String msg : messages) {
                        dos.writeUTF(msg);
                        dos.flush();
                        System.out.println("Writer: Sent -> " + msg);
                        Thread.sleep(500); // simulate delay
                    }
                } catch (IOException | InterruptedException e) {
                    System.out.println("Writer error: " + e.getMessage());
                }
            });

            // Reader Thread
            Thread readerThread = new Thread(() -> {
                try (DataInputStream dis = new DataInputStream(pis)) {
                    String msg;
                    while (!(msg = dis.readUTF()).equals("END")) {
                        System.out.println("Reader: Received -> " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("Reader error: " + e.getMessage());
                }
            });

            // Start both threads
            writerThread.start();
            readerThread.start();

            // Wait for both to finish
            writerThread.join();
            readerThread.join();

            System.out.println("✅ Inter-thread communication completed.");

        } catch (IOException | InterruptedException e) {
            System.out.println("Main error: " + e.getMessage());
        }
    }
}
