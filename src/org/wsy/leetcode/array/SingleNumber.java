package org.wsy.leetcode.array;

import java.util.Arrays;
/**
 * 只出现一次的数字
 * 
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 
 * 输入: [2,2,1]
 * 输出: 1
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        } else {
            boolean[] mirror = new boolean[nums.length];
            for(int i=0;i<nums.length;i++) {
                boolean match = false;
                for(int j=0;j<nums.length;j++) {
                    if(i != j && nums[i] == nums[j]) {
                        match = true;
                        break;
                    }
                }
                mirror[i] = match;          
            }
            for(int i=0;i<nums.length;i++) {
                if(!mirror[i]) {
                    return nums[i];
                }
            }
            return -1;
        }
    }
}