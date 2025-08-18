import java.io.*;

public class StudentDataStream {
    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {
        // Step 1: Write student details
        writeStudentData();

        // Step 2: Read student details
        readStudentData();
    }

    // Method to write data
    private static void writeStudentData() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            // Example student records
            dos.writeInt(101);          // Roll Number
            dos.writeUTF("Alice");      // Name
            dos.writeDouble(8.7);       // GPA

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(9.1);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(7.8);

            System.out.println("✅ Student details written to " + FILE_NAME);

        } catch (IOException e) {
            System.out.println("⚠️ Error writing data: " + e.getMessage());
        }
    }

    // Method to read data
    private static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("✅ Reading student details from file:");
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error reading data: " + e.getMessage());
        }
    }
}
