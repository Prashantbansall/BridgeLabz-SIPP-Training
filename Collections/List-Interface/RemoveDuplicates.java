import java.util.*;

public class RemoveDuplicates {

    // Method to remove duplicates while preserving order
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (!seen.contains(item)) {
                seen.add(item);
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        System.out.println("Original List: " + numbers);
        List<Integer> uniqueList = removeDuplicates(numbers);
        System.out.println("List after removing duplicates: " + uniqueList);
    }
}
