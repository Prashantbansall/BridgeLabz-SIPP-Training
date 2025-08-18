import java.util.*;

class CircularBuffer {
    private int[] buffer;
    private int head;   // points to the oldest element
    private int tail;   // points to the next insertion position
    private int size;   // number of elements in buffer
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    // Add element to circular buffer
    public void enqueue(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;

        if (size == capacity) {
            // Overwrite: move head forward
            head = (head + 1) % capacity;
        } else {
            size++;
        }
    }

    // Remove element (oldest)
    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Buffer is empty");
        }
        int value = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }

    // Get all elements as list
    public List<Integer> getBufferContents() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(buffer[(head + i) % capacity]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        System.out.println("Buffer: " + cb.getBufferContents()); // [1, 2, 3]

        cb.enqueue(4); // Overwrites 1
        System.out.println("Buffer after inserting 4: " + cb.getBufferContents()); // [2, 3, 4]

        cb.enqueue(5); // Overwrites 2
        System.out.println("Buffer after inserting 5: " + cb.getBufferContents()); // [3, 4, 5]

        System.out.println("Dequeued: " + cb.dequeue()); // 3
        System.out.println("Buffer after dequeue: " + cb.getBufferContents()); // [4, 5]
    }
}
