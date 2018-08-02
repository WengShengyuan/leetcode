package org.wsy.leetcode.tree;

import javafx.beans.binding.IntegerBinding;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树层次遍历
 * <p>
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/50/
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null)
            return list;
        else {

            prev(root, list, 0);
            return list;
        }
    }

    private void prev(TreeNode node, List<List<Integer>> list, int level) {

        if (node != null) {

            if (list.size() < level+1) {
                List<Integer> currentLevel = new LinkedList<>();
                currentLevel.add(node.val);
                list.add(currentLevel);
            } else {
                list.get(level).add(node.val);
            }

            prev(node.left, list, level + 1);
            prev(node.right, list, level + 1);

        }

    }
}
