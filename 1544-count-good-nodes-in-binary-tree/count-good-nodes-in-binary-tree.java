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
 class NodePair{
    TreeNode node;
    int max;
    NodePair(TreeNode node,int max){
        this.node=node;
        this.max=max;
    }
 }
class Solution {
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=0;
        Queue<NodePair> q=new LinkedList<>();
        NodePair p=new NodePair(root,root.val);
        q.offer(p);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                NodePair pair=q.poll();
                TreeNode node=pair.node;
                int maxSoFar=pair.max;
                if(node.val>=maxSoFar){
                    ans+=1;
                }
                int nextMax=Math.max(node.val,maxSoFar);
                if(node.left!=null){
                    q.offer(new NodePair(node.left,nextMax));
                }
                if(node.right!=null){
                    q.offer(new NodePair(node.right,nextMax));
                }
            }
        }
                    return ans;


    }
}