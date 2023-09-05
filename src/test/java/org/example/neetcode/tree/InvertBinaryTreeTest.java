package org.example.neetcode.tree;

import org.example.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.utils.TreeUtils.printTree;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class InvertBinaryTreeTest {

    InvertBinaryTree solution;
    TreeUtils treeUtils;

    @BeforeEach
    public void setup(){
        this.solution = new InvertBinaryTree();
        this.treeUtils = new TreeUtils();
    }


    @Test
    public void test1(){
        // Test case 1
        // Original tree:        Inverted tree:
        //     4                       4
        //    / \                     / \
        //   2   7                   7   2
        //  / \ / \                 / \ / \
        // 1  3 6  9               9  6 3  1
        TreeNode root1 = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );
        TreeNode expected1 = new TreeNode(4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1))
        );
        TreeNode result1 = solution.invertTree(root1);

        printTree(root1);
        printTree(result1);
        assertTrue(treeUtils.isSameTree(expected1, result1));
    }

    @Test
    public void test2() {
        // Test case 2
        // Original tree:        Inverted tree:
        //     2                       2
        //    / \                     / \
        //   1   3                   3   1
        TreeNode root2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode expected2 = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        TreeNode result2 = solution.invertTree(root2);

        printTree(root2);
        printTree(result2);
        assertTrue(treeUtils.isSameTree(expected2, result2));
    }

    @Test
    public void test3() {
        // Test case 3
        // Original tree:        Inverted tree:
        //      1                       1
        //     / \                     / \
        //    2   3                   3   2
        TreeNode root3 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode expected3 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        TreeNode result3 = solution.invertTree(root3);

        printTree(root3);
        printTree(result3);
        assertTrue(treeUtils.isSameTree(expected3, result3));
    }

    @Test
    public void test4() {
        // Test case 4
        // Original tree:        Inverted tree:
        //      1                       1
        TreeNode root4 = new TreeNode(1);
        TreeNode expected4 = new TreeNode(1);
        TreeNode result4 = solution.invertTree(root4);

        printTree(root4);
        printTree(result4);
        assertTrue(treeUtils.isSameTree(expected4, result4));
    }

    @Test
    public void test5() {
        // Test case 5
        // Original tree:        Inverted tree:
        //      []                       []
        TreeNode root5 = null;
        TreeNode expected5 = null;
        TreeNode result5 = solution.invertTree(root5);

        printTree(root5);
        printTree(result5);
        assertTrue(treeUtils.isSameTree(expected5, result5));
    }


}