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
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode ans=inorder(root,k);
        return ans.val;
    }
    public TreeNode inorder(TreeNode root,int k){
        if(root==null) return null;
        TreeNode left=inorder(root.left,k);
        if(left!=null) return left;
        count+=1;
        if(count==k) return root;
        return inorder(root.right,k);
    }
}