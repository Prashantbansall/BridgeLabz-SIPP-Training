import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "large_log.txt";  // Path to the large file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) { // case-insensitive match
                    System.out.println("Line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }

            System.out.println("✅ Finished scanning file for 'error'.");

        } catch (IOException e) {
            System.out.println("⚠️ Error reading file: " + e.getMessage());
        }
    }
}
