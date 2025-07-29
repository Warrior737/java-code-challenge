package leet.code.data.structures.linkedlist.singly.SwapNodesInPairs;

public class SwapNodesInPairs {

    private Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public SwapNodesInPairs(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void makeEmpty() {
        head = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void swapPairs() {
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - Swaps every two adjacent nodes in the linked    |
        //   |   list.                                           |
        //   | - The method modifies the list in place.          |
        //   |                                                   |
        //   | Behavior:                                         |
        //   | - A dummy node is used to simplify swapping the   |
        //   |   first pair.                                     |
        //   | - In each iteration, two nodes (`first` and       |
        //   |   `second`) are swapped by adjusting pointers.    |
        //   | - The `previous` pointer helps reconnect the      |
        //   |   swapped pairs to the rest of the list.          |
        //   | - The `first` pointer then moves forward two      |
        //   |   nodes at a time.                                |
        //   | - At the end, `head` is updated to point to the   |
        //   |   new first node.                                 |
        //   +===================================================+

        Node dummy = new Node(0);
        dummy.next = head;
        Node previous = dummy;
        Node first = head;

        while(first != null && first.next != null){
            Node second = first.next;

            // Perform the swap
            previous.next = second;
            first.next = second.next;
            second.next = first;

            //Move pointers
            previous = first;
            first = first.next;
        }
        head = dummy.next;
    }


    public void swapPairsExplained() {

        // Create a dummy node pointing to the head
        // This simplifies edge cases, like swapping the first pair
        Node dummy = new Node(0);
        dummy.next = head;

        // previous tracks the node before the current pair
        Node previous = dummy;

        // first is the first node in the pair to be swapped
        Node first = head;

        // Loop while there are at least two nodes to swap
        while (first != null && first.next != null) {

            // second is the second node in the pair
            Node second = first.next;

            // Point previous to second, starting the swap
            previous.next = second;

            // Point first to the node after the second
            first.next = second.next;

            // Point second to first, completing the swap
            second.next = first;

            // Move previous to first (end of swapped pair)
            previous = first;

            // Move first to the next pair's first node
            first = first.next;
        }

        // Reset head to point to the new start of the list
        head = dummy.next;
    }


}