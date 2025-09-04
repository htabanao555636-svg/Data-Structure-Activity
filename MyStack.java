package hamprii;

public class MyStack {
    private int[] stack;   // array to hold stack elements
    private int top;       // index of the top element
    private int capacity;  // maximum size of the stack

    // Constructor
    public MyStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // empty stack
    }

    // Push operation
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed " + value + " into stack.");
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        int val = stack[top--];
        System.out.println("Popped: " + val);
    }

    // Display operation
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
