package javaMethods;
import java.util.Scanner;

public class HandshakeCalculator {
	
	public static int maximumHandshakes(int numberOfStudents) {
		return (numberOfStudents * (numberOfStudents - 1)) / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int handshakes = maximumHandshakes(numberOfStudents);
		System.out.println(handshakes);
	}
}
