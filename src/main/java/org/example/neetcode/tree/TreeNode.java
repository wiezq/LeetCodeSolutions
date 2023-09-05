package org.example.neetcode.tree;

import org.example.utils.TreePrinter;

public class TreeNode implements TreePrinter.PrintableNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createTreeFromArray(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[index]);
        root.left = createTreeFromArray(arr, 2 * index + 1);
        root.right = createTreeFromArray(arr, 2 * index + 2);

        return root;
    }

    @Override
    public TreePrinter.PrintableNode getLeft() {
        return left;
    }

    @Override
    public TreePrinter.PrintableNode getRight() {
        return right;
    }

    @Override
    public String getText() {
        return String.valueOf(val);
    }
}