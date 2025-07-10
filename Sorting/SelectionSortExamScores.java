// Selection Sort:- Sort Exam Scores
// Problem Statement:- A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
// Hint:-
// Find the minimum element in the array.
// Swap it with the first unsorted element.
// Repeat the process for the remaining elements.


package BubbleSort;
import java.util.Scanner;

public class SelectionSortExamScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}

