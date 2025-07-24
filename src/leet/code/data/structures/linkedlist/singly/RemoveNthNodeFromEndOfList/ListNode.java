package leet.code.data.structures.linkedlist.singly.RemoveNthNodeFromEndOfList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }


    public void printList(){

        ListNode temp = next;

        while ( temp != null  ){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases (e.g., removing the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n + 1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the Nth node from the end
        slow.next = slow.next.next;

        return dummy.next; // Return the new head
    }

}
