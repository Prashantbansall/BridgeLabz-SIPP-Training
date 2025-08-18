import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    // Function to reverse the queue
    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        // Remove the front element
        int front = queue.remove();

        // Recur for the remaining queue
        reverse(queue);

        // Add the removed element back
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        reverse(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
