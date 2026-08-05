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
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int path){
        if(root==null){
            return 0;
        }
        int sum=0;
        path=path*10+(root.val);
        if(root.left==null && root.right==null){
            sum+=path;
        }
        sum+=dfs(root.left,path);
        sum+=dfs(root.right,path);
        return sum;
    }
}