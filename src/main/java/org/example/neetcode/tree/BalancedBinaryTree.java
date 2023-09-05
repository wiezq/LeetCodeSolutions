package org.example.neetcode.tree;

public class BalancedBinaryTree {
    MaxDepth maxDepth = new MaxDepth();


    public boolean isBalanced(TreeNode root) {
        int left = maxDepth.maxDepth(root.left);
        int right = maxDepth.maxDepth(root.right);

        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
}
