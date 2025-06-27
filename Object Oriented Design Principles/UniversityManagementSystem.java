package objectOrientedDesignPrinciples;
import java.util.ArrayList;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void teachCourse(UniCourse course) {
        course.assignProfessor(this);
    }
}

class UniStudent {
    String name;
    ArrayList<UniCourse> enrolledCourses;

    UniStudent(String name) {
        this.name = name;
        enrolledCourses = new ArrayList<>();
    }

    void enrollCourse(UniCourse course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (UniCourse c : enrolledCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class UniCourse {
    String courseName;
    Professor professor;
    ArrayList<UniStudent> students;

    UniCourse(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void assignProfessor(Professor p) {
        professor = p;
    }

    void addStudent(UniStudent s) {
        students.add(s);
    }

    void showDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "None"));
        System.out.println("Students:");
        for (UniStudent s : students) {
            System.out.println("- " + s.name);
        }
    }
}


public class UniversityManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor prof1 = new Professor("Dr. Smith");
        UniStudent s1 = new UniStudent("Alice");
        UniStudent s2 = new UniStudent("Bob");

        UniCourse c1 = new UniCourse("Data Structures");
        UniCourse c2 = new UniCourse("Operating Systems");

        prof1.teachCourse(c1);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        s1.showCourses();
        s2.showCourses();

        c1.showDetails();
        c2.showDetails();
	}

}
