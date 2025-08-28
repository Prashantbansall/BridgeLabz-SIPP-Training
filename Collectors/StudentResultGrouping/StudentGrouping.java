import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String gradeLevel;
    Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
}

public class StudentGroupingExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "A"),
            new Student("Bob", "B"),
            new Student("Charlie", "A"),
            new Student("David", "C")
        );

        Map<String, List<String>> groupedByGrade = students.stream()
            .collect(Collectors.groupingBy(
                student -> student.gradeLevel,
                Collectors.mapping(student -> student.name, Collectors.toList())
            ));

        System.out.println(groupedByGrade);
    }
}
