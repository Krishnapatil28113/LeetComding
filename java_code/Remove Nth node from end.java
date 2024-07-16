/*
# Problem Statement: Remove Nth node from end in a LinkedList
---------------------------------------------------------------
# Approach :
- Make use of two pointers (nodes)
- one pointer points at the Nth node and the other at (N-1)th node the connect the 2nd pointer to next of Nth node 
---------------------------------------------------------------
*/

public ListNode removeNthFromEnd(ListNode head, int n) {
        // Write your code here.
        ListNode temp = head;
        ListNode prev = temp;
        int count =0;
        while(temp != null) {
            count ++;
            temp = temp.next; 
        }
        int num = count-n;
        temp = head;
        int i=0;
        while(temp != null && i != num) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        if(temp == head) {
            head = temp.next;
        } else {
            if(temp.next != null) {
                prev.next = temp.next;
            } else {
                prev.next = null;
            }
        }
        return head;
    }
