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
    public boolean isSymmetric(TreeNode root) {
        return(isS(root,root));
    }
    
    public boolean isS(TreeNode root1, TreeNode root2)
    {
        if(root1==null && root2==null)
        return true;
        if(root1!= null && root2!=null && root1.val==root2.val)
        return(isS(root1.left, root2.right) && isS(root1.right, root2.left));
        return false;
    }
}