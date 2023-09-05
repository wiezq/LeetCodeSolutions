package org.example.neetcode.tree;

public class DiameterOfBinaryTree {
    int max = -1;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);

        return max;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return -1;
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        max = Math.max(max, left + right);

        return Math.max(left, right);
    }
}
