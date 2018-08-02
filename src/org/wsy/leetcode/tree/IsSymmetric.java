package org.wsy.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 对称二叉树
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/49/
 */
public class IsSymmetric {

    boolean isSymmetrical(TreeNode r1, TreeNode r2) {
        // 均空
        if (r1 == null && r2 == null)
            return true;

        // 其中一个空
        if (r1 == null || r2 == null)
            return false;

        // 都不空(两者相等，左右镜像）
        return r1.val == r2.val && isSymmetrical(r1.left, r2.right) && isSymmetrical(r1.right, r2.left);
    }

    public boolean isSymmetric(TreeNode pRoot) {
        System.out.println(pRoot);
        return isSymmetrical(pRoot, pRoot);
    }
}
