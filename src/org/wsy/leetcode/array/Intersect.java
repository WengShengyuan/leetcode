package org.wsy.leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * 两个数组的交集 II
 * 
 * 给定两个数组，写一个方法来计算它们的交集。
 * 注意:
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 
 * 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length < nums2.length) {
            return doIntersect(nums2, nums1);
        } else {
            return doIntersect(nums1, nums2);
        }
    }
    private int[] doIntersect(int[] longer, int[] shorter) {
        List<Integer> forbidIndexList = new LinkedList<Integer>();
        List<Integer> resultList = new LinkedList<Integer>();
        for(int i=0;i<shorter.length;i++) {
            for(int j = 0;j<longer.length;j++) {
                if(!forbidIndexList.contains(j)) {
                    if(shorter[i] == longer[j]) {
                        resultList.add(shorter[i]);
                        forbidIndexList.add(j);
                        break;
                    }
                }
            }
        }
        int[] finalResult = new int[resultList.size()];
        for(int i=0;i<resultList.size();i++) {
            finalResult[i] = resultList.get(i);
        }
        return finalResult;
    }
}
