package leet.code.data.structures.stackQueues.QueueUsingStackEnqueue;

public class Main {
    public static void main(String[] args) {
        QueueWithStacksEnqueue queue;

        System.out.println("These tests confirm enqueue works");
        System.out.println("and maintains elements in FIFO order.");
        System.out.println("peek() shows the first element (front).");
        System.out.println();

        // Test 1: Enqueue single element
        System.out.println("Test 1: Enqueue Single Element");
        queue = new QueueWithStacksEnqueue();
        queue.enqueue(10);
        System.out.println("Expected Front (peek): 10");
        System.out.println("Actual Front: " + queue.peek());
        System.out.println("Queue is empty? " + queue.isEmpty());
        System.out.println();

        // Test 2: Enqueue multiple elements
        System.out.println("Test 2: Enqueue Multiple Elements");
        queue = new QueueWithStacksEnqueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Expected Front (peek): 1");
        System.out.println("Actual Front: " + queue.peek());
        System.out.println("Queue is empty? " + queue.isEmpty());
        System.out.println();

        // Test 3: Enqueue maintains order
        System.out.println("Test 3: Enqueue Maintains Order");
        queue = new QueueWithStacksEnqueue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println("Front after 3 enqueues: " + queue.peek());
        queue.enqueue(8);
        System.out.println("Front after adding 8: " + queue.peek());
        System.out.println();

        // Test 4: Enqueue into empty queue
        System.out.println("Test 4: Enqueue into Empty Queue");
        queue = new QueueWithStacksEnqueue();
        System.out.println("Queue is empty? " + queue.isEmpty());
        queue.enqueue(42);
        System.out.println("Expected Front (peek): 42");
        System.out.println("Actual Front: " + queue.peek());
        System.out.println("Queue is empty? " + queue.isEmpty());
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm enqueue works
            and maintains elements in FIFO order.
            peek() shows the first element (front).

            Test 1: Enqueue Single Element
            Expected Front (peek): 10
            Actual Front: 10
            Queue is empty? false

            Test 2: Enqueue Multiple Elements
            Expected Front (peek): 1
            Actual Front: 1
            Queue is empty? false

            Test 3: Enqueue Maintains Order
            Front after 3 enqueues: 5
            Front after adding 8: 5

            Test 4: Enqueue into Empty Queue
            Queue is empty? true
            Expected Front (peek): 42
            Actual Front: 42
            Queue is empty? false
        */

    }
}
