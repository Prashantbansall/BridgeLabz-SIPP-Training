package Generics.MultiLevelUniversityCourseManagementSystem;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseInfo() + " is evaluated through assignments.");
    }
}

