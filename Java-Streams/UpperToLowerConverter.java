import java.io.*;

public class UpperToLowerConverter {
    public static void main(String[] args) {
        String sourceFile = "source.txt";      // input file
        String destinationFile = "lowercase.txt"; // output file

        try (
            // FileReader & FileWriter can use default charset
            FileReader fr = new FileReader(sourceFile);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(destinationFile);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert uppercase → lowercase
                bw.write(line.toLowerCase());
                bw.newLine(); // preserve line breaks
            }

            System.out.println("✅ File converted to lowercase and saved as " + destinationFile);

        } catch (IOException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }
}
