package org.wsy.leetcode.tree;

/**
 * 二叉树的最大深度
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 返回它的最大深度 3 。
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/47/
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return prev(root, 1);

    }

    private int prev(TreeNode node, int i) {
        if (node != null) {
            System.out.println(node.val + "," + i);
            if (node.left != null || node.right != null)
                i++;
            int l = prev(node.left, i);
            int r = prev(node.right, i);
            return l > r ? l : r;
        } else {
            return i;
        }
    }
}
