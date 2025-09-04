package hamprii;

import java.util.Scanner;

public class DataStructureOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyStack stack = new MyStack(10);
        MyQueue queue = new MyQueue(10);
        MyLinkedList linkedList = new MyLinkedList(10);
        MyCircularLinkedList circularList = new MyCircularLinkedList();

        while (true) {
            System.out.println("\nChoose Data Structure:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Linked List");
            System.out.println("4. Circular Linked List");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = safeNextInt(scanner);

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n--- Stack Operations ---");
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Display");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        int op = safeNextInt(scanner);

                        if (op == 0) break;
                        switch (op) {
                            case 1:
                                System.out.print("Enter value to push: ");
                                int v = safeNextInt(scanner);
                                stack.push(v);
                                break;
                            case 2:
                                stack.pop();
                                break;
                            case 3:
                                stack.display();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\n--- Queue Operations ---");
                        System.out.println("1. Enqueue");
                        System.out.println("2. Dequeue");
                        System.out.println("3. Display");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        int op = safeNextInt(scanner);

                        if (op == 0) break;
                        switch (op) {
                            case 1:
                                System.out.print("Enter value to enqueue: ");
                                int v = safeNextInt(scanner);
                                queue.enqueue(v);
                                break;
                            case 2:
                                queue.dequeue();
                                break;
                            case 3:
                                queue.display();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("\n--- Linked List Operations ---");
                        System.out.println("1. Insert at end");
                        System.out.println("2. Delete at beginning");
                        System.out.println("3. Display");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        int op = safeNextInt(scanner);

                        if (op == 0) break;
                        switch (op) {
                            case 1:
                                System.out.print("Enter value to insert: ");
                                int v = safeNextInt(scanner);
                                linkedList.insertAtEnd(v);
                                break;
                            case 2:
                                linkedList.deleteAtBeginning();
                                break;
                            case 3:
                                linkedList.display();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 4:
                    while (true) {
                        System.out.println("\n--- Circular Linked List Operations ---");
                        System.out.println("1. Insert");
                        System.out.println("2. Delete");
                        System.out.println("3. Display");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        int op = safeNextInt(scanner);

                        if (op == 0) break;
                        switch (op) {
                            case 1:
                                System.out.print("Enter value to insert: ");
                                int v = safeNextInt(scanner);
                                circularList.insert(v);
                                break;
                            case 2:
                                circularList.delete();
                                break;
                            case 3:
                                circularList.display();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static int safeNextInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            sc.next(); // discard invalid token
            System.out.print("Enter choice/value: ");
        }
        return sc.nextInt();
    }
}
