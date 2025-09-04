package hamprii;

public class MyQueue {
    private int[] queue;   // array to store queue elements
    private int front;     // points to the first element
    private int rear;      // points to the last element
    private int capacity;  // maximum size of the queue
    private int count;     // number of elements in the queue

    // Constructor
    public MyQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (count == capacity) {
            System.out.println("Queue overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // wrap around if needed
        queue[rear] = value;
        count++;
        System.out.println("Enqueued " + value + " into queue.");
    }

    // Dequeue operation
    public void dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        int val = queue[front];
        front = (front + 1) % capacity; // move front pointer
        count--;
        System.out.println("Dequeued: " + val);
    }

    // Display operation
    public void display() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue contents: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}
