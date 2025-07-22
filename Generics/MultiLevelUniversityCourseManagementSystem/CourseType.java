package Generics.MultiLevelUniversityCourseManagementSystem;

public abstract class CourseType {
    protected String courseName;
    protected String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public abstract void evaluate();

    public String getCourseInfo() {
        return courseName + " by " + instructor;
    }
}
