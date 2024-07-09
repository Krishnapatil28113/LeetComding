/*
# Problem Statement: Delete Duplicated from LinkedList
---------------------------------------------------------------
# Approach : 
Create a dummy node to simplify edge case handling.
Set a temporary pointer to this dummy node.
Traverse the list to check each node.
If current node and next node have the same value, skip all duplicates.
Link the temporary pointer to the node after the duplicates.
If no duplicates, just move the temporary pointer.
Continue this process until the end of the list.
---------------------------------------------------------------
*/


public ListNode deleteDuplicates(ListNode head) {
                // Write your code here.
        ListNode new1 = new ListNode();
        new1.next = head;
        ListNode temp = new1;

        while(head != null) {
            if(head.next != null && head.val == head.next.val) {
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                temp.next = head.next;
            } else {
                temp = temp.next;
            }
            head = head.next;
        }
        return new1.next;
    }
