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
    List<Integer> ans=new ArrayList<>();
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root,0);
        if(ans.contains(targetSum)) return true;
        else return false;
    }
    public void dfs(TreeNode root,int sum){
        if(root==null){
            return;
        }
        sum+=root.val;
        if(root.left==null && root.right==null){
            ans.add(sum);
        }
        dfs(root.left,sum);
        dfs(root.right,sum);

    }
}