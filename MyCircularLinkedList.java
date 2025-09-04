package hamprii;

public class MyCircularLinkedList {
    // Node class: represents each element
    private static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node head; // first node
    private Node tail; // last node (tail.next always points to head)

    // Insert at end of circular list
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) { // list empty
            head = tail = newNode;
            tail.next = head; // point to itself
        } else {
            tail.next = newNode; // old tail points to new node
            tail = newNode;      // update tail
            tail.next = head;    // make it circular
        }

        System.out.println("Inserted " + value + " into circular list.");
    }

    // Delete from beginning
    public void delete() {
        if (head == null) { // empty list
            System.out.println("Circular linked list is empty.");
            return;
        }

        int val = head.data;

        if (head == tail) { // only one node
            head = tail = null;
        } else {
            head = head.next;   // move head forward
            tail.next = head;   // tail should still point to head
        }

        System.out.println("Deleted: " + val);
    }

    // Show all elements
    public void display() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        System.out.print("Circular linked list contents: ");
        Node current = head;

        // Use do-while because we must visit head at least once
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}
