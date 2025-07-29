package leet.code.data.structures.linkedlist.singly.BinaryToDecimal;

public class Main {

    public static void main(String[] args) {
        BinaryToDecimal myLinkedList;

        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        myLinkedList = new BinaryToDecimal(1);
        myLinkedList.makeEmpty();
        System.out.println("List: (empty)");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
        System.out.println();

        // Test 2: Single node (0)
        System.out.println("Test 2: Single Node (0)");
        myLinkedList = new BinaryToDecimal(0);
        System.out.print("List: ");
        myLinkedList.printList();
        System.out.println("Expected: 0");
        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
        System.out.println();

        // Test 3: Single node (1)
        System.out.println("Test 3: Single Node (1)");
        myLinkedList = new BinaryToDecimal(1);
        System.out.print("List: ");
        myLinkedList.printList();
        System.out.println("Expected: 1");
        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
        System.out.println();

        // Test 4: Multi-node (101)
        System.out.println("Test 4: Multi-Node (101)");
        myLinkedList = new BinaryToDecimal(1);
        myLinkedList.append(0);
        myLinkedList.append(1);
        System.out.print("List: ");
        myLinkedList.printList();
        System.out.println("Expected: 5");
        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
        System.out.println();

        // Test 5: Multi-node (1111)
        System.out.println("Test 5: Multi-Node (1111)");
        myLinkedList = new BinaryToDecimal(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        System.out.print("List: ");
        myLinkedList.printList();
        System.out.println("Expected: 15");
        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
        System.out.println();

        // Test 6: Multi-node (10010)
        System.out.println("Test 6: Multi-Node (10010)");
        myLinkedList = new BinaryToDecimal(1);
        myLinkedList.append(0);
        myLinkedList.append(0);
        myLinkedList.append(1);
        myLinkedList.append(0);
        System.out.print("List: ");
        myLinkedList.printList();
        System.out.println("Expected: 18");
        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Empty List
            List: (empty)
            Expected: 0
            Actual: 0

            Test 2: Single Node (0)
            List: 0
            Expected: 0
            Actual: 0

            Test 3: Single Node (1)
            List: 1
            Expected: 1
            Actual: 1

            Test 4: Multi-Node (101)
            List: 1 -> 0 -> 1
            Expected: 5
            Actual: 5

            Test 5: Multi-Node (1111)
            List: 1 -> 1 -> 1 -> 1
            Expected: 15
            Actual: 15

            Test 6: Multi-Node (10010)
            List: 1 -> 0 -> 0 -> 1 -> 0
            Expected: 18
            Actual: 18
        */

    }

}

