package leet.code.data.structures.linkedlist.singly.BinaryToDecimal;

public class BinaryToDecimal {


    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public BinaryToDecimal(int value) {
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
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //   +===================================================+
    //   |               WRITE YOUR CODE HERE                |
    //   | Description:                                      |
    //   | - This method converts a binary number,           |
    //   |   represented as a linked list, to a decimal int. |
    //   |                                                   |
    //   | Return type: int                                  |
    //   | - Returns the decimal equivalent of the binary    |
    //   |   number.                                         |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - We use a while loop to traverse the linked list.|
    //   | - Multiply the current sum by 2 and add the value |
    //   |   at each node to get the decimal number.         |
    //   +===================================================+




    public int binaryToDecimal() {
        // Initialize an integer variable 'num' to 0.
        // This variable will hold the decimal value of the binary number.
        int num = 0;

        // Initialize a Node variable 'current' to point to the head of the LinkedList.
        // We will use 'current' to traverse through the LinkedList.
        Node current = head;

        // Begin a while loop that continues as long as 'current' is not null.
        // A null 'current' would mean we've reached the end of the LinkedList.
        while (current != null) {

            // For each node, shift the existing 'num' value one binary place to the left
            // by multiplying it by 2. Then, add the value of the current node to it.
            // This will build our binary number into its decimal equivalent,
            // one bit at a time.
            num = num * 2 + current.value;

            // Move to the next node in the LinkedList.
            // 'current.next' will either point to the next node, or to null
            // if we've reached the end of the list.
            current = current.next;
        }

        // After the loop, return the decimal value stored in 'num'.
        return num;
    }
}
