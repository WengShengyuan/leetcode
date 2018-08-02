package org.wsy.leetcode.tree;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }

    public TreeNode trimLeft() {
        left = null;
        return this;
    }

    public TreeNode trimRight() {
        right = null;
        return this;
    }



    @Override
    public String toString() {
        return "{" + val + "[" + left + "," + right + "]}";
    }
}
