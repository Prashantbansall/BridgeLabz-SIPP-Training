package this_static_final_keywords_and_instanceof_operator;

class Employee {
    static String companyName = "ABC Corp";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Name: " + e.name);
            System.out.println("ID: " + e.id);
            System.out.println("Designation: " + e.designation);
            System.out.println("Company: " + companyName);
        }
    }
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Alice", 101, "Developer");
        Employee e2 = new Employee("Bob", 102, "Manager");

        e1.displayDetails(e1);
        e2.displayDetails(e2);

        Employee.displayTotalEmployees();
	}
}
