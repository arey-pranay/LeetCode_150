class Solution {
    int i;
    int p; 

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        i = inorder.length - 1;
        p = postorder.length - 1;
        return build(inorder, postorder, Integer.MIN_VALUE);
    }

    public TreeNode build(int[] inorder, int[] postorder, int stop) {
        if (p < 0)
            return null;
        if (inorder[i] == stop) {
            i--;
            return null;
        }
        TreeNode node = new TreeNode(postorder[p--]);
        node.right = build(inorder, postorder, node.val);
        node.left = build(inorder, postorder, stop);
        return node;
    }
}
