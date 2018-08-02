package org.wsy.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 验证二叉搜索树
 * <p>
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 假设一个二叉搜索树具有如下特征：
 * -节点的左子树只包含小于当前节点的数。
 * -节点的右子树只包含大于当前节点的数。
 * -所有左子树和右子树自身必须也是二叉搜索树。
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/48/
 */
public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        mid(root, list);
        if(list.size() < 1) {
            return true;
        }

        int first = list.get(0);
        for(int i=1;i<list.size();i++) {
            if(list.get(i) <= first) {
                return false;
            }
            first = list.get(i);
        }

        return true;
    }

    private void mid(TreeNode node, List<Integer> list) {

        if(node != null) {
            mid(node.left,list);
            System.out.println(node.val);
            list.add(node.val);
            mid(node.right,list);
        }
    }

}
