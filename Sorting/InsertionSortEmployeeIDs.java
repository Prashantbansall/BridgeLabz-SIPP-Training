// Insertion Sort:- Sort Employee IDs
// Problem Statement:- A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
// Hint:-
// Divide the array into sorted and unsorted parts.
// Pick an element from the unsorted part and insert it into its correct position in the sorted part.
// Repeat for all elements.


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
