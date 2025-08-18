import java.io.*;

public class BackupTest {
    public static void main(String[] args) {
        BackupData data = new BackupData("report.pdf", 10);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.dat"))) {
            oos.writeObject(data); // works because class implements Serializable
            System.out.println("Backup successful: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
