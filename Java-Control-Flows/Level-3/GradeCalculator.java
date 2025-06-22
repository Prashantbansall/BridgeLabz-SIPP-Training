package level3ControlFlowPrograms;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int maths = scanner.nextInt();

        int total = physics + chemistry + maths;
        double average = total / 3.0;

        if (average >= 80) {
            System.out.println("Average: " + average);
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        } else if (average >= 70) {
            System.out.println("Average: " + average);
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        } else if (average >= 60) {
            System.out.println("Average: " + average);
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below, but approaching agency-normalized standards");
        } else if (average >= 50) {
            System.out.println("Average: " + average);
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        } else if (average >= 40) {
            System.out.println("Average: " + average);
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1-, too below agency-normalized standards");
        } else {
            System.out.println("Average: " + average);
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }
	}

}
