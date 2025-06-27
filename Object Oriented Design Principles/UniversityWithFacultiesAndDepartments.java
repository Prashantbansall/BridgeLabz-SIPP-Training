package objectOrientedDesignPrinciples;
import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Faculty: " + name);
    }
}

class UniversityDepartment {
    String deptName;

    UniversityDepartment(String deptName) {
        this.deptName = deptName;
    }

    void display() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String universityName;
    ArrayList<UniversityDepartment> departments;
    ArrayList<Faculty> faculties;

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    void addDepartment(UniversityDepartment d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showStructure() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (UniversityDepartment d : departments) {
            d.display();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }

    void closeUniversity() {
        departments.clear();
        System.out.println("University " + universityName + " closed. All departments deleted.");
    }
}


public class UniversityWithFacultiesAndDepartments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University u = new University("Global Tech University");

        UniversityDepartment d1 = new UniversityDepartment("Computer Science");
        UniversityDepartment d2 = new UniversityDepartment("Mechanical Engineering");

        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");

        u.addDepartment(d1);
        u.addDepartment(d2);

        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showStructure();

        u.closeUniversity();

        u.showStructure();
	}

}
