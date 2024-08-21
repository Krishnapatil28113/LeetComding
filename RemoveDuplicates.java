/*
# Problem Statement: remove the duplicate elements from a given linked list
---------------------------------------------------------------
# Approach :
 - traverse untill the list is empty
 - chacke for the pointers value and move the pointers accordingly
---------------------------------------------------------------
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode temp1, temp2;
        temp1 = head;
        temp2 = head.next;
        int last = head.val;

        while(temp2 != null){ // while end of Linked list
            if(temp2.val == last){ // Current number same to last number
                if(temp2.next == null){ // If last element, just delete and break loop
                    temp1.next = null;
                    break;
                }
                temp2 = temp2.next; // Not last, then delete that element
                temp1.next = temp2; // and move to next element
            }
            else{ // If not the same as last element, jump to next node
                temp1 = temp2; 
                last = temp1.val;
                temp2 = temp2.next;
            }
        }
        return head;
    }
}
