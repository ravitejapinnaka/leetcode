public class Solution {
    public void deleteNode(ListNode node) {
        ListNode latter=node.next;
        if(latter==null){
            node=null;
            
        }
        else{
        node.val=latter.val;
        node.next=latter.next;
        latter.next=latter;
        }
    }
}