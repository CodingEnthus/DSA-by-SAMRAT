// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// public class Codec {
//     StringBuilder sb=new StringBuilder();
//     int count=0;
//     // Encodes a tree to a single string.
//     public String serialize(TreeNode root) {
        
//         if(root==null){
//             sb.append("null,");
//             return sb.toString();
//         }
//         sb.append(String.valueOf(root.val)).append(",");
//         serialize(root.left);
//         serialize(root.right);
//         return sb.toString();
        
//     }
//     public TreeNode deserialize(String data) {

//         String[] values = data.split(",");
//         count = 0;

//         // return build(values);
//     }

//     // Decodes your encoded data to tree.
//     public TreeNode build(String[] values) {
//         if(values[count].equals("null")){
//             count++;
//             return null;
//         }
//         TreeNode node=new TreeNode(Integer.parseInt(values[count++]));
        
//         node.left=build(values);
//         node.right=build(values);
//         return node;
//     }
// }

// // Your Codec object will be instantiated and called as such:
// // Codec ser = new Codec();
// // Codec deser = new Codec();
// // TreeNode ans = deser.deserialize(ser.serialize(root));

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                sb.append("null,");
                continue;
            }

            sb.append(curr.val).append(",");
            q.add(curr.left);
            q.add(curr.right);
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("null")) return null;

        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();

            if (!arr[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
            i++;

            if (i < arr.length && !arr[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }
}