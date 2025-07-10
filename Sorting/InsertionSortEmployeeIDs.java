package BubbleSort;
import java.util.Scanner;

public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] empIds = new int[n];
        for (int i = 0; i < n; i++) {
            empIds[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int key = empIds[i];
            int j = i - 1;
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            empIds[j + 1] = key;
        }
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
