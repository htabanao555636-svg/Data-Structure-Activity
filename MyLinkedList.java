package hamprii;

public class MyLinkedList {
    private int[] list;      // array to hold data
    private int size;        // current number of elements
    private int capacity;    // max size of list

    public MyLinkedList(int capacity) {
        this.capacity = capacity;
        list = new int[capacity];
        size = 0;
    }

    // Insert at end
    public void insertAtEnd(int value) {
        if (size == capacity) {
            System.out.println("List is full. Cannot insert " + value);
            return;
        }
        list[size++] = value;
        System.out.println("Inserted " + value + " at end.");
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }
        int val = list[0];
        // shift all elements left
        for (int i = 1; i < size; i++) {
            list[i - 1] = list[i];
        }
        size--;
        System.out.println("Deleted from beginning: " + val);
    }

    // Display contents
    public void display() {
        if (size == 0) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Linked list contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
