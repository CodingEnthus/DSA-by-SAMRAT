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
        return dfs(root,"");
    }
    public int dfs(TreeNode root,String path){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(path.isEmpty()){
            path=String.valueOf(root.val);
        }else{
            path=path+String.valueOf(root.val);
        }
        if(root.left==null && root.right==null){
            sum+=Integer.parseInt(path);
        }
        sum+=dfs(root.left,path);
        sum+=dfs(root.right,path);
        return sum;
    }
}