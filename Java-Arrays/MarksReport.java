package javaArrays;
import java.util.Scanner;

public class MarksReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int[][] marks = new int[students][3];
        double[] percentages = new double[students];
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                int mark = scanner.nextInt();
                if (mark < 0) {
                    j--;
                    continue;
                }
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            if (percentages[i] >= 80)
                grades[i] = 'A';
            else if (percentages[i] >= 70)
                grades[i] = 'B';
            else if (percentages[i] >= 60)
                grades[i] = 'C';
            else if (percentages[i] >= 50)
                grades[i] = 'D';
            else if (percentages[i] >= 40)
                grades[i] = 'E';
            else
                grades[i] = 'R';
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println(" ");
        }
	}

}
