public class DatabaseConnection {

    private boolean connected = false;

    // Simulate connecting to a database
    public void connect() {
        connected = true;
        System.out.println("Database connected.");
    }

    // Simulate disconnecting from a database
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected.");
    }

    // Check if connection is active
    public boolean isConnected() {
        return connected;
    }
}
