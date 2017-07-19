/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
        Queue<TreeLinkNode> q1 = new LinkedList<TreeLinkNode>();
        if(root==null)
            return;
        q.add(root);
        q.add(null);
        root.next = null;
        while(!q.isEmpty()){
            root= q.poll();
            if(!(root== null)) {
                    if(!(root.left== null)){
                        q.add(root.left);
                    q1.add(root.left);
                    }
                    if(!(root.right== null)){
                        q.add(root.right);
                    q1.add(root.right);
                    }
            }
            else{
                TreeLinkNode root1= q1.poll();
                while(!q1.isEmpty()){  
                    TreeLinkNode root2= q1.poll();
                    root1.next = root2;
                    root1 = root2;
                }
                if(!q.isEmpty())
                q.add(null);
            }
        }
    }
}