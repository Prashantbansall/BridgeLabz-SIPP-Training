package objectOrientedDesignPrinciples;

import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    void dissolveCompany() {
        departments.clear();
        System.out.println("Company " + companyName + " dissolved. All departments and employees removed.");
    }
}


public class CompanyAndDepartments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company("TechCorp");

        Department d1 = new Department("Engineering");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Charlie"));

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyStructure();

        company.dissolveCompany();
	}

}
