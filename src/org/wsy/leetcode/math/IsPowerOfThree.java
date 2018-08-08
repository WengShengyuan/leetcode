package org.wsy.leetcode.math;

/**
 * 3的次幂
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/62/
 */
public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        int maxPower = (int) Math.pow(3,(int)(Math.log(0x7fffffff)/Math.log(3)));
        return maxPower % n == 0;
    }
}
