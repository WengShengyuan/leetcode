package org.wsy.leetcode.array;
/**
 * 旋转数组
 * 
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return;
        } else {
            for(int i=0;i<k;i++) {
                moveOne(nums);
            }
        }
    }
    private void moveOne(int[] nums) {
        int length = nums.length;
        int temp = nums[length-1];
        for(int i=length-1;i>0;i--) {
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
    }
}
