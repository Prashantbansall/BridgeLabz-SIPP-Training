package Generics.MultiLevelUniversityCourseManagementSystem;

public class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseInfo() + " is evaluated through research work.");
    }
}

