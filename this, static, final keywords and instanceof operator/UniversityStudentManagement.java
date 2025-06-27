package this_static_final_keywords_and_instanceof_operator;

class Student {
    static String universityName = "XYZ University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
            System.out.println("University: " + universityName);
        }
    }
}

public class UniversityStudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Alice", 101, 'A');
        Student s2 = new Student("Bob", 102, 'B');

        s1.displayDetails(s1);
        s2.displayDetails(s2);

        Student.displayTotalStudents();
	}

}
