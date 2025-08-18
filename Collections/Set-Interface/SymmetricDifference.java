import java.util.*;

public class SymmetricDifference {

    // Method to find symmetric difference
    public static <T> Set<T> getSymmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        Set<T> temp = new HashSet<>(set2);

        result.addAll(set2);       // Union
        temp.retainAll(set1);      // Intersection
        result.removeAll(temp);    // Remove intersection from union

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> symmetricDiff = getSymmetricDifference(set1, set2);
        System.out.println("Symmetric Difference: " + symmetricDiff);
    }
}
