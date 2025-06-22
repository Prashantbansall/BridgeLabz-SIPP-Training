package level2PracticeProblems;

import java.util.*;

public class HandshakeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println(handshakes);
	}

}
