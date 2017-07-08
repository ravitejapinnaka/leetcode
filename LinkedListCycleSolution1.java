/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode fast,slow;
        fast=head; slow = head;
        while(fast.next != null)
        {
            fast= fast.next;
            if(slow==fast)
                return true;
            slow=slow.next;
            if(fast.next!=null)
            {
            fast=fast.next;
            if(slow==fast)
                return true;
            }
        }
        return false;        
    }
}