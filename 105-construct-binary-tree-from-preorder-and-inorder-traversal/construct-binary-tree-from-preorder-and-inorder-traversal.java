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
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return myfunc(preorder,0,preorder.length-1);
    }
    public TreeNode myfunc(int[] preorder,int start,int end){
        if(start>end) return null;
        int rootval=preorder[count++];
        TreeNode root=new TreeNode(rootval);
        int mid=map.get(rootval);
        root.left=myfunc(preorder,start,mid-1);
        root.right=myfunc(preorder,mid+1,end);
        return root;

    }
}