


package operators;

public class PensDividedAndNotDivided {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPens = 14;
        int numberOfStudents = 3;

        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}

}
