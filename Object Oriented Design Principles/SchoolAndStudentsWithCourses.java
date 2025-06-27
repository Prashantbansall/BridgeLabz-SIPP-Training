package objectOrientedDesignPrinciples;
import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }

    void enrollStudent(Student s) {
        enrolledStudents.add(s);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println("Student: " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enrollInCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("Enrolled in: " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showAllStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            s.showCourses();
        }
    }
}

public class SchoolAndStudentsWithCourses {
	public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showAllStudents();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
