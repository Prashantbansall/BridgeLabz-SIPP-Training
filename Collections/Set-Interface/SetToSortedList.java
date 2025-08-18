import java.util.*;

public class SetToSortedList {

    // Method to convert HashSet to sorted List
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList); // Sort in ascending order
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Original Set: " + hashSet);

        List<Integer> sortedList = convertToSortedList(hashSet);
        System.out.println("Sorted List: " + sortedList);
    }
}
