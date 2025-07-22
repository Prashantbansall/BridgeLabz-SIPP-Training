package Generics.MultiLevelUniversityCourseManagementSystem;

public class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseInfo() + " is evaluated through exams.");
    }
}

