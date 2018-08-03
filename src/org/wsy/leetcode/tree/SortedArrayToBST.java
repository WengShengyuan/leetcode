package org.wsy.leetcode.tree;

/**
 * 将有序数组转换为二叉搜索树
 *
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/51/
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] A) {
        if(A == null) return null;
        TreeNode root = null;
        return newTreeNode (root, A, 0, A.length-1);
    }

    public TreeNode newTreeNode (TreeNode node, int[] A, int start, int end) {
        if (start > end) {return null; }
        node = new TreeNode(0);
        int mid = end - (end - start)/2;
        node.val = A[mid];
        node.left = newTreeNode(node.left, A, start, mid - 1);
        node.right = newTreeNode(node.right, A, mid + 1, end);
        return node;
    }

}
