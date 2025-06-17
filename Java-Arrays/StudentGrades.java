package javaArrays;
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

        int[] physics = new int[numberOfStudents];
        int[] chemistry = new int[numberOfStudents];
        int[] maths = new int[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            physics[i] = scanner.nextInt();
            if (physics[i] < 0) {
                i--;
                continue;
            }

            chemistry[i] = scanner.nextInt();
            if (chemistry[i] < 0) {
                i--;
                continue;
            }

            maths[i] = scanner.nextInt();
            if (maths[i] < 0) {
                i--;
                continue;
            }

            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grades[i] = 'A';
            } else if (percentage[i] >= 70) {
                grades[i] = 'B';
            } else if (percentage[i] >= 60) {
                grades[i] = 'C';
            } else if (percentage[i] >= 50) {
                grades[i] = 'D';
            } else if (percentage[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics = " + physics[i] + ", Chemistry = " + chemistry[i] + ", Maths = " + maths[i] + ", Percentage = " + percentage[i] + "%, Grade = " + grades[i]);
        }
	}

}
