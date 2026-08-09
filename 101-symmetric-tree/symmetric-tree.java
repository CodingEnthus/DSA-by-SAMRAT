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
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left,root.right);
    }
    public boolean dfs(TreeNode A,TreeNode B){
        if(A==null && B==null){
            return true;
        }if(A==null || B==null){
            return false;
        }
        return A.val==B.val&&dfs(A.left,B.right)&& dfs(A.right,B.left);

    }
}