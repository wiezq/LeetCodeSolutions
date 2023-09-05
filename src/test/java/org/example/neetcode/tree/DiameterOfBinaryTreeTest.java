package org.example.neetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree dbt;

    @BeforeEach
    public void setup() {
        dbt = new DiameterOfBinaryTree();
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(4,
                new TreeNode(7),
                new TreeNode(-3,
                        new TreeNode(-9,
                                new TreeNode(9,
                                        new TreeNode(6,
                                                new TreeNode(0, null, new TreeNode(-1)),
                                                new TreeNode(6, new TreeNode(-4), null)), null),
                                new TreeNode(-7,
                                        new TreeNode(-6,
                                                new TreeNode(5), null),
                                        new TreeNode(-6,
                                                new TreeNode(9,
                                                        new TreeNode(-2), null), null))),
                        new TreeNode(-3, new TreeNode(-4), null)
                ));
        int result = dbt.diameterOfBinaryTree(root);
        int expected = 8;
        Assertions.assertEquals(expected, result);
    }
}
