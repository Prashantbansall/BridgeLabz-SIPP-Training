import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
}

public class AvgSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", "HR", 50000),
            new Employee("Jane", "Engineering", 75000),
            new Employee("Doe", "HR", 55000),
            new Employee("Anna", "Engineering", 80000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));
        System.out.println(avgSalaryByDept);
    }
}
