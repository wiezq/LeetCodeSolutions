package org.example.neetcode.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBinaryTreeTest {
    BalancedBinaryTree bbt;

    @BeforeEach
    public void setup() {
        bbt = new BalancedBinaryTree();
    }

    @Test
    public void testBalancedTree() {
        // Construct a balanced binary tree
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        boolean result = bbt.isBalanced(root);
        assertTrue(result, "Expected tree to be balanced.");
    }

    @Test
    public void testUnbalancedTree() {
        // Construct an unbalanced binary tree
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4, null, null),
                                null),
                        null),
                null);

        boolean result = bbt.isBalanced(root);
        assertFalse(result, "Expected tree to be unbalanced.");
    }
}
