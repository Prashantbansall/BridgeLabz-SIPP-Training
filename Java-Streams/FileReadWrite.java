import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Check if source file exists
            File src = new File(sourceFile);
            if (!src.exists()) {
                System.out.println("Source file does not exist: " + sourceFile);
                return;
            }

            // Open input and output streams
            fis = new FileInputStream(src);
            fos = new FileOutputStream(destinationFile);

            // Read from source and write to destination
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing file streams: " + e.getMessage());
            }
        }
    }
}

