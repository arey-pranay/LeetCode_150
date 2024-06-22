// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int getMinimumDifference(TreeNode root) {
//         if(root==null) return 0;
//         int min = Integer.MAX_VALUE;
//         int temp = Integer.MAX_VALUE;
//         List<Integer> in = new ArrayList<>();
//         trav(root,in);
//         for(int i=1;i<in.size()-1;i++){
//             int ip = Math.abs(in.get(i)-in.get(i-1));
//             int is = Math.abs(in.get(i)-in.get(i+1));
//             int a = Math.min(ip,is);
//             temp = Math.min(temp,a);
//         }
//         // return temp;
//         return Math.min(inorder(root, min),temp);
//     }
//     public static void trav(TreeNode root,List<Integer> in){
//         if(root==null) return ;
//         trav(root.left,in);
//         in.add(root.val);
//         trav(root.right,in);
//     }
//     public int inorder(TreeNode root, int min){
//         System.out.println(root.val +" : "+ min);
//         if(root.left==null&&root.right==null){
//             return min;
//         }
//         int rd = Integer.MAX_VALUE;
//         if(root.right!=null){
//             rd = Math.abs(root.val - root.right.val);
//         }
//         int ld = Integer.MAX_VALUE;
//         if(root.left!=null){
//             ld = Math.abs(root.val - root.left.val);
//         }
//         int dif = Math.min(rd,ld);
//         min = Math.min(min,dif);
//         if(root.right!=null){
//             rd = inorder(root.right,min);
//         }
//         if(root.left!=null){
//             ld = inorder(root.left,min);
//         }
//         return Math.min(rd,ld);
//     }
// }

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
 
    int minDiff = Integer.MAX_VALUE;
    Integer prev = null;
        
    public int getMinimumDifference(TreeNode root) {
        
        if(root==null) return minDiff;
        
        getMinimumDifference(root.left);
        
        if(prev!=null){
            minDiff=Math.min(minDiff,root.val-prev);
        }
        if(root!=null){
            prev=root.val;
        }
        
        getMinimumDifference(root.right);
        
        return minDiff;
    }
}
