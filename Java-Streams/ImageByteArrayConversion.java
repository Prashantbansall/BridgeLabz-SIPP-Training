import java.io.*;
import java.util.Arrays;

public class ImageByteArrayConversion {
    public static void main(String[] args) {
        String sourceImage = "source.jpg";     // original image
        String destinationImage = "copy.jpg";  // new image

        try {
            // Step 1: Read image into byte array
            byte[] imageBytes = readFileToByteArray(sourceImage);

            // Step 2: Convert byte array using ByteArrayInputStream & ByteArrayOutputStream
            byte[] processedBytes = processBytes(imageBytes);

            // Step 3: Write byte array back to new image file
            writeByteArrayToFile(processedBytes, destinationImage);

            // Step 4: Verify both files (basic check: compare size & content)
            if (Arrays.equals(imageBytes, processedBytes)) {
                System.out.println("✅ The new file is identical to the original image.");
            } else {
                System.out.println("⚠️ Files differ! (Check manually).");
            }

        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    // Read file into byte array
    private static byte[] readFileToByteArray(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Process bytes in memory (via ByteArrayInputStream)
    private static byte[] processBytes(byte[] inputBytes) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(inputBytes);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Write byte array to file
    private static void writeByteArrayToFile(byte[] data, String filePath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(data);
        }
    }
}
