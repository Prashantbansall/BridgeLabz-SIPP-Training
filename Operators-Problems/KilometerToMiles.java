import java.util.Scanner;

public class KilometerToMiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(miles);
        scanner.close();
    }
}