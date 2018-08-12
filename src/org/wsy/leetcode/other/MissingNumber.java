package org.wsy.leetcode.other;

import java.util.Arrays;

/**
 * 缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/26/others/69/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length <1) {
            return 0;
        }


        Arrays.sort(nums);

        if(nums[0]!=0) {
            return 0;
        }


        int length = nums.length -1;

        for( int i=0;i<length;i++) {
            if(nums[i+1] - nums[i] > 1) {
                return nums[i] + 1;
            }
        }
        return nums.length;
    }
}
