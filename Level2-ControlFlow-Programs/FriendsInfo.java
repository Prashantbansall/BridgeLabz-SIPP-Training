package level2ControlFlowPrograms;
import java.util.Scanner;

public class FriendsInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age and height(cm) of Amar: ");
        int ageAmar = scanner.nextInt();
        double heightAmar = scanner.nextDouble();

        System.out.print("Enter age and height(cm) of Akbar: ");
        int ageAkbar = scanner.nextInt();
        double heightAkbar = scanner.nextDouble();

        System.out.print("Enter age and height(cm) of Anthony: ");
        int ageAnthony = scanner.nextInt();
        double heightAnthony = scanner.nextDouble();

        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
	}

}
