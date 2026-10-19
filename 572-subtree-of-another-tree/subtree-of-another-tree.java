/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(isSame(root,subRoot)) return true;
        boolean left=isSubtree(root.left,subRoot);
        boolean right=isSubtree(root.right,subRoot);
        return left||right;

    }
    public boolean isSame(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null && q!=null || p!=null && q==null)  return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right) && p.val==q.val;
    }
}