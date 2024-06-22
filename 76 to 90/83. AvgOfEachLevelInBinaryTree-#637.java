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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return l;
        q.add(root);
        while(!q.isEmpty()){
            int sz = q.size();
            double sum = 0;
            for(int i =0;i<sz;i++){
                TreeNode temp = q.remove();
                sum += temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            l.add(sum/sz);
        }
        return l;
    }
}
