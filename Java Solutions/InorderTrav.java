/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> l=new ArrayList<Integer>(50);
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
        return l;
        else{
            inorderTraversal(root.left);
            l.add(root.val);
            inorderTraversal(root.right);
            
        }
        return l;
    }
}