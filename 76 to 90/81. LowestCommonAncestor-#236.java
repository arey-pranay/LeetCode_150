// import java.util.Stack;

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }

// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         Stack<TreeNode> pathToP = new Stack<>(); // Path for p
//         Stack<TreeNode> pathToQ = new Stack<>(); // Path for q
        
//         // Find paths from root to p and q
//         findPath(root, p, pathToP);
//         findPath(root, q, pathToQ);
        
//         // Find the last common node in both paths
//         TreeNode lca = null;
//         while (!pathToP.isEmpty() && !pathToQ.isEmpty()) {
//             TreeNode nodeP = pathToP.remove(0);
//             TreeNode nodeQ = pathToQ.remove(0);
//             if (nodeP == nodeQ) {
//                 lca = nodeP;
//             } else {
//                 break;
//             }
//         }
        
//         return lca;
//     }
    
//     private boolean findPath(TreeNode root, TreeNode target, Stack<TreeNode> path) {
//         if (root == null) return false;
        
//         path.push(root);
        
//         // If the current node is the target node
//         if (root.val == target.val) {
//             return true;
//         }
        
//         // Check left and right subtrees
//         if (findPath(root.left, target, path) || findPath(root.right, target, path)) {
//             return true;
//         }
        
//         // Backtrack: remove the node if not part of the path to target
//         path.pop();
//         return false;
//     }
// }

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) {
            return root;
        }
        return (left != null) ? left : right;
    }
}
