import java.util.LinkedList;

public class NthFromEnd {

    // Method to find the Nth element from the end
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        var fast = list.listIterator();
        var slow = list.listIterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is larger than list size");
            }
            fast.next();
        }

        // Move both until fast reaches the end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;

        System.out.println("LinkedList: " + list);
        String result = findNthFromEnd(list, N);
        System.out.println(N + "th element from the end is: " + result);
    }
}
