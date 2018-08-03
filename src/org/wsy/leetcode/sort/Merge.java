package org.wsy.leetcode.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 合并两个有序数组
 * <p>
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * - 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * - 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * <p>
 * 输入
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/8/sorting-and-searching/52/
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i< m;i++) {
            list.add(nums1[i]);
        }
        for(int j = 0;j< n;j++) {
            list.add(nums2[j]);
        }

        Collections.sort(list);
        int size = list.size();
        for(int i = 0;i< size;i++) {
            nums1[i] = list.get(i);
        }
    }


}
