package leet.code.data.structures.linkedlist.singly.ReverseBetween;

public class Main {

    public static void main(String[] args) {
        ReverseBetween myLinkedList;

        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        myLinkedList = new ReverseBetween(1);
        myLinkedList.makeEmpty();
        myLinkedList.reverseBetween(0, 0);
        System.out.println("List: (empty)");
        System.out.println("Expected: empty");
        myLinkedList.printList();
        System.out.println();

        // Test 2: Single node list
        System.out.println("Test 2: Single Node");
        myLinkedList = new ReverseBetween(10);
        myLinkedList.reverseBetween(0, 0);
        System.out.println("List: 10");
        System.out.println("Expected: 10");
        myLinkedList.printList();
        System.out.println();

        // Test 3: Reverse sublist in middle (1 -> 2 -> 3 -> 4 -> 5; reverse 1..3)
        System.out.println("Test 3: Reverse Sublist in Middle");
        myLinkedList = new ReverseBetween(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(1, 3);  // Reverse nodes 2,3,4
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 1 -> 4 -> 3 -> 2 -> 5");
        myLinkedList.printList();
        System.out.println();

        // Test 4: Reverse from head (reverse 0..2)
        System.out.println("Test 4: Reverse From Head");
        myLinkedList = new ReverseBetween(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(0, 2);  // Reverse nodes 1,2,3
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 3 -> 2 -> 1 -> 4 -> 5");
        myLinkedList.printList();
        System.out.println();

        // Test 5: Reverse to tail (reverse 2..4)
        System.out.println("Test 5: Reverse To Tail");
        myLinkedList = new ReverseBetween(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(2, 4);  // Reverse nodes 3,4,5
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 1 -> 2 -> 5 -> 4 -> 3");
        myLinkedList.printList();
        System.out.println();

        // Test 6: Reverse entire list (0..4)
        System.out.println("Test 6: Reverse Entire List");
        myLinkedList = new ReverseBetween(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(0, 4);
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 5 -> 4 -> 3 -> 2 -> 1");
        myLinkedList.printList();
        System.out.println();

        // Test 7: startIndex == endIndex (no change)
        System.out.println("Test 7: No Change (start == end)");
        myLinkedList = new ReverseBetween(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(2, 2);
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 1 -> 2 -> 3 -> 4 -> 5");
        myLinkedList.printList();
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Empty List
            List: (empty)
            Expected: empty
            empty

            Test 2: Single Node
            List: 10
            Expected: 10
            10

            Test 3: Reverse Sublist in Middle
            Original: 1 -> 2 -> 3 -> 4 -> 5
            Expected: 1 -> 4 -> 3 -> 2 -> 5
            1 -> 4 -> 3 -> 2 -> 5

            Test 4: Reverse From Head
            Original: 1 -> 2 -> 3 -> 4 -> 5
            Expected: 3 -> 2 -> 1 -> 4 -> 5
            3 -> 2 -> 1 -> 4 -> 5

            Test 5: Reverse To Tail
            Original: 1 -> 2 -> 3 -> 4 -> 5
            Expected: 1 -> 2 -> 5 -> 4 -> 3
            1 -> 2 -> 5 -> 4 -> 3

            Test 6: Reverse Entire List
            Original: 1 -> 2 -> 3 -> 4 -> 5
            Expected: 5 -> 4 -> 3 -> 2 -> 1
            5 -> 4 -> 3 -> 2 -> 1

            Test 7: No Change (start == end)
            Original: 1 -> 2 -> 3 -> 4 -> 5
            Expected: 1 -> 2 -> 3 -> 4 -> 5
            1 -> 2 -> 3 -> 4 -> 5
        */

    }

}

