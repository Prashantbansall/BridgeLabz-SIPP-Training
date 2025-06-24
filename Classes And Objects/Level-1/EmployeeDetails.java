package classes.and.objects.level1;

class Employee{
	String EmployeeName;
	int EmployeeId;
	double EmployeeSalary;
	
	Employee(String EmployeeName, int EmployeeId, double EmployeeSalary) {
		this.EmployeeName = EmployeeName;
		this.EmployeeId = EmployeeId;
		this.EmployeeSalary = EmployeeSalary;
	}
	
	void displayDetails() {
		System.out.println("Employee Name - " + EmployeeName);
		System.out.println("Employee Id - " + EmployeeId);
		System.out.println("Employee Salary - " + EmployeeSalary);
		
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Prashant Bansal", 01, 1200000);
		Employee employee2 = new Employee("Harsh Mittal",02,2000000);
		
		System.out.println("=== Employee Details ===");
		System.out.println("Employee 1: ");
		employee1.displayDetails();
		System.out.println();
		System.out.println("Employee 2: ");
		employee2.displayDetails();
	}

}
