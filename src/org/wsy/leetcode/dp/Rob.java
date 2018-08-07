package org.wsy.leetcode.dp;

/**
 * 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 */
public class Rob {
    public int rob(int[] nums) {
        if(nums == null || nums.length ==0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        } else if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0],nums[1]);
            for(int i=2;i<nums.length;i++) {
                dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
            }
            int max= Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++) {
                if(dp[i]>max) {
                    max= dp[i];
                }
            }
            return max;
        }
     }
}