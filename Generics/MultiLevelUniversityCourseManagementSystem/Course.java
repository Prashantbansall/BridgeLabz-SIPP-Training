package Generics.MultiLevelUniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public void evaluateAll() {
        for (T course : courseList) {
            course.evaluate();
        }
    }

    // Accepts any type of course using wildcard
    public static void evaluateCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.evaluate();
        }
    }
}

