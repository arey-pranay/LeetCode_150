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
    public void flatten(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = preorder(arr,root);
        System.out.println(arr);
        TreeNode temp = root;
        for(int i=1;i<arr.size();i++){
            temp.left = null;
            temp.right = new TreeNode(arr.get(i));
            temp=temp.right;
        }
        
    }
    public ArrayList<Integer> preorder(ArrayList<Integer> a, TreeNode root){
        if(root==null) return a;
        a.add(root.val);
        preorder(a,root.left);
        preorder(a,root.right);
        return a;
    }
}
