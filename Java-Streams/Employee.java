import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
