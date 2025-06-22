package level2ControlFlowPrograms;
import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus");
        }
	}

}
