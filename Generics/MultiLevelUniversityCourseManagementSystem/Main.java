package Generics.MultiLevelUniversityCourseManagementSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<CourseType> allCourses = new ArrayList<>();

        System.out.print("Enter number of courses to add: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nCourse #" + (i + 1));

            System.out.print("Enter course name: ");
            String name = sc.nextLine();

            System.out.print("Enter instructor name: ");
            String instructor = sc.nextLine();

            System.out.print("Enter course type (exam/assignment/research): ");
            String type = sc.nextLine().trim().toLowerCase();

            switch (type) {
                case "exam":
                    allCourses.add(new ExamCourse(name, instructor));
                    break;
                case "assignment":
                    allCourses.add(new AssignmentCourse(name, instructor));
                    break;
                case "research":
                    allCourses.add(new ResearchCourse(name, instructor));
                    break;
                default:
                    System.out.println("Invalid course type. Skipping this course.");
            }
        }

        // Display and evaluate
        System.out.println("\n=== Evaluation Summary ===");
        Course.evaluateCourses(allCourses);

        sc.close();
    }
}


