import java.io.*;
import java.util.*;

public class EmployeeSerializationDemo {
    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        // Step 1: Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "IT", 60000));
        employees.add(new Employee(103, "Charlie", "Finance", 55000));

        // Step 2: Serialize the list into a file
        serializeEmployees(employees);

        // Step 3: Deserialize and display employees
        List<Employee> deserializedEmployees = deserializeEmployees();
        if (deserializedEmployees != null) {
            System.out.println("✅ Employees retrieved from file:");
            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }
        }
    }

    // Serialize
    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("✅ Employee list serialized to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("⚠️ Error during serialization: " + e.getMessage());
        }
    }

    // Deserialize
    @SuppressWarnings("unchecked")
    private static List<Employee> deserializeEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException e) {
            System.out.println("⚠️ Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("⚠️ Class not found: " + e.getMessage());
        }
        return null;
    }
}
