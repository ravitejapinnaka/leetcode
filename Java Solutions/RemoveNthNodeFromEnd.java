public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1 = head, temp2= head, h=head;
        if(head.next==null)
            return null;
        for(int i=1; i<n; i++)
            head = head.next;
        if((head.next==null))
            return h.next;
        else{
        while(!(head.next==null)){
            temp2= temp1;
            temp1=temp1.next;
            head=head.next;
        }
        temp2.next= temp1.next;
        return h;
        }
    }
}