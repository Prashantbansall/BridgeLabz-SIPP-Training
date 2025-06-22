package level2ControlFlowPrograms;

import java.util.Scanner;

public class FriendsComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int ageAmar = scanner.nextInt();
        int heightAmar = scanner.nextInt();

        int ageAkbar = scanner.nextInt();
        int heightAkbar = scanner.nextInt();

        int ageAnthony = scanner.nextInt();
        int heightAnthony = scanner.nextInt();

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Youngest: Amar");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Tallest: Amar");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }
	}
}
