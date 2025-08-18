import java.io.*;

public class UserInfoToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;

        try {
            // Read input from user
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write to file
            writer = new FileWriter("user_info.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("✅ User information saved to user_info.txt");

        } catch (IOException e) {
            System.out.println("⚠️ An error occurred: " + e.getMessage());
        } finally {
            try {
                if (writer != null) writer.close();
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
