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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean lr=true;
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                    TreeNode node=q.poll();
                    level.add(node.val);
                    if(node.left!=null){
                        q.offer(node.left);
                    }if(node.right!=null){
                        q.offer(node.right);

                    }
            }
            if(lr){
                ans.add(level);
                lr=false;
            }else{
                Collections.reverse(level);
                ans.add(level);
                lr=true;
            }
        }
        return ans;
    }
}