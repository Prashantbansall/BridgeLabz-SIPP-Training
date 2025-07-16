import java.util.Scanner;

public class IceCreamRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] flavors = new String[8];
        int[] sales = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter flavor " + (i + 1) + ": ");
            flavors[i] = sc.nextLine();
        }

        for (int i = 0; i < 8; i++) {
            while (true) {
                System.out.print("Enter sales for " + flavors[i] + ": ");
                if (sc.hasNextInt()) {
                    sales[i] = sc.nextInt();
                    if (sales[i] >= 0) break;
                    else System.out.println("Sales can't be negative. Try again.");
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next(); // clear the invalid input
                }
            }
        }

        sc.close();

        for (int i = 0; i < sales.length - 1; i++) {
            for (int j = 0; j < sales.length - i - 1; j++) {
                if (sales[j] < sales[j + 1]) {
                    int temp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = temp;

                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }

        System.out.println("\nFlavors sorted by popularity:");
        for (int i = 0; i < 8; i++) {
            System.out.println(flavors[i] + " - " + sales[i] + " sales");
        }
    }
}
