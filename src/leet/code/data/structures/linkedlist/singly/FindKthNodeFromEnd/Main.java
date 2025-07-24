package leet.code.data.structures.linkedlist.singly.FindKthNodeFromEnd;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);

        int k = 3 ;
        int result = myLinkedList.findKthFromEnd(k).value;

        System.out.println("Result : " + result); // Output: 4
        /*
            EXPECTED OUTPUT:
            ----------------
            4

        */

        LinkedList myLinkedList2 = new LinkedList(1);

        int k2 = 1;
        int result2 = myLinkedList2.findKthFromEnd(k2).value;

        System.out.println(result2);



    }

}
