public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA,t2=headB;
        int l1=0,l2=0;
        while(!(t1==null)){
            l1++;
            t1=t1.next;
        }
        while(!(t2==null)){
            l2++;
            t2=t2.next;
        }
        t1=headA;t2=headB;
        if(l1<l2){
            while((l2-l1)!=0){
                t2=t2.next;
            l1++;
             }
        }
        else{
            while((l2-l1)!=0){
                t1=t1.next;
            l2++;
             }
        }
        
        while(!(t1==null) && !(t2==null)){
            if(t1==t2)
                return t1;
            t1=t1.next;
            t2=t2.next;
        }
        return null;
        
    }
}