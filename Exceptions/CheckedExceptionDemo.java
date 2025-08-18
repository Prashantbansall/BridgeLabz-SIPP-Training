import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("✅ File contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("⚠️ An error occurred while reading the file: " + e.getMessage());
        }
    }
}

