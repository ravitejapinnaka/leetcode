public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev,current, latter;
        if(head==null)
            return null;
        prev=null;current=head;latter=current.next;
        while(current!=null){
            current.next=prev;
            prev=current;
            current=latter;
            if(current!=null)
            latter=current.next;
        }
        return prev;
    }
}