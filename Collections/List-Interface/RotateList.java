import java.util.*;

public class RotateList {

    // Method to rotate a list by k positions
    public static <T> void rotateList(List<T> list, int k) {
        int n = list.size();
        k = k % n; // Handle cases where k > n
        if (k == 0) return;

        // Reverse three parts: [0..k-1], [k..n-1], then whole list
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }

    // Helper method to reverse elements in a list
    private static <T> void reverse(List<T> list, int left, int right) {
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;

        System.out.println("Original List: " + numbers);
        rotateList(numbers, k);
        System.out.println("List after rotating by " + k + ": " + numbers);
    }
}
