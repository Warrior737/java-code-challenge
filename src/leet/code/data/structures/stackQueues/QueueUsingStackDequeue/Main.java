package leet.code.data.structures.stackQueues.QueueUsingStackDequeue;

public class Main {

    public static void main(String[] args) {
        QueueUsingStackDequeue queue;

        System.out.println("These tests confirm enqueue and dequeue work");
        System.out.println("with proper FIFO behavior.");
        System.out.println("peek() shows the front (first) element.");
        System.out.println();

        // Test 1: Dequeue single element
        System.out.println("Test 1: Dequeue Single Element");
        queue = new QueueUsingStackDequeue();
        queue.enqueue(10);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue is empty? " + queue.isEmpty());
        System.out.println();

        // Test 2: Dequeue multiple elements in FIFO order
        System.out.println("Test 2: Dequeue Multiple Elements (FIFO)");
        queue = new QueueUsingStackDequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue is empty? " + queue.isEmpty());
        System.out.println();

        // Test 3: Peek after dequeue
        System.out.println("Test 3: Peek After Dequeue");
        queue = new QueueUsingStackDequeue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek after dequeue: " + queue.peek());
        System.out.println("Queue is empty? " + queue.isEmpty());
        System.out.println();

        // Test 4: Dequeue from empty queue
        System.out.println("Test 4: Dequeue from Empty Queue");
        queue = new QueueUsingStackDequeue();
        System.out.println("Dequeued from empty: " + queue.dequeue());
        queue.enqueue(42);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued again (empty): " + queue.dequeue());
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm enqueue and dequeue work
            with proper FIFO behavior.
            peek() shows the front (first) element.

            Test 1: Dequeue Single Element
            Dequeued: 10
            Queue is empty? true

            Test 2: Dequeue Multiple Elements (FIFO)
            Dequeued: 1
            Dequeued: 2
            Dequeued: 3
            Queue is empty? true

            Test 3: Peek After Dequeue
            Dequeued: 5
            Peek after dequeue: 6
            Queue is empty? false

            Test 4: Dequeue from Empty Queue
            Dequeued from empty: null
            Dequeued: 42
            Dequeued again (empty): null
        */

    }
}
