import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        double time;

        principal = scanner.nextDouble();
        rate = scanner.nextDouble();
        time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100.0;

        System.out.println(simpleInterest);

        scanner.close();
    }
}