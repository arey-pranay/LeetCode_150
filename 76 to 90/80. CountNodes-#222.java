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
    // public int countNodes(TreeNode root) {
    //     Queue<TreeNode> q = new LinkedList<>();
    //     if(root==null) return 0;
    //     int count = 0;
    //     q.add(root);
    //     while(!q.isEmpty()){
    //         int sz = q.size();
    //         for(int i=0;i<sz;i++){
    //             TreeNode temp = q.remove();
    //             count++;
    //             if(temp.left!=null) q.add(temp.left);
    //             if(temp.right!=null) q.add(temp.right);
    //         }
    //     }
    //     return count;
    // }
      public int countNodes(TreeNode root) {
        if(root==null) return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
