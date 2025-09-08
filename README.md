# Data-Structure-Activity
This program demonstrates the basic data structures (Stack, Queue, Linked List, and Circular Linked List) and their common operations. Each data structure is implemented as a Java class inside the hamprii package.

1️⃣ Stack (MyStack)

Internally uses an array and a top pointer.

Push → adds an element on top of the stack (stack[++top]).

Pop → removes the top element (stack[top--]).

Display → prints elements from top to bottom.

Handles stack overflow (when array is full) and underflow (when stack is empty).

<img width="291" height="327" alt="2" src="https://github.com/user-attachments/assets/0a07fd96-de4c-48fe-9a28-daf8ae0d3bf1" />
<img width="262" height="315" alt="3" src="https://github.com/user-attachments/assets/481af63a-4e69-45c7-af68-d4658c35993c" />



2️⃣ Queue (MyQueue)

Uses an array, with front, rear, and count to manage items.

Implements a circular queue using modulo (%) to wrap around.

Enqueue → inserts an element at the rear.

Dequeue → removes an element from the front.

Display → shows elements in correct order from front to rear.

Checks for overflow (full queue) and underflow (empty queue).

<img width="306" height="333" alt="4" src="https://github.com/user-attachments/assets/63dff7d4-d441-4710-850b-9a3288bd3618" />


3️⃣ Linked List (MyLinkedList)

Uses a simple array-based implementation (not pointer nodes).

Insert at end → appends an element at the end of the list.

Delete at beginning → removes the first element and shifts remaining items left.

Display → prints all elements in order.

Checks if the list is full or empty.

<img width="326" height="180" alt="6" src="https://github.com/user-attachments/assets/e2d2ecc7-ca2e-4fbd-bc97-74f1880292f8" />

4️⃣ Circular Linked List (MyCircularLinkedList)

Uses a Node class with data and next.

Maintains both head (first node) and tail (last node).

Insert → adds a node at the end; updates tail.next = head to keep circularity.

Delete → removes the head node and updates pointers.

Display → traverses nodes in a loop until it returns to head.

Handles the case when the list is empty or has one node.
<img width="366" height="343" alt="8" src="https://github.com/user-attachments/assets/113a74c8-5c9c-46e2-99d8-d2d6c99542d2" />
