package org.wsy.leetcode.math;

/**
 * 计数质数
 * <p>
 * 统计所有小于非负整数 n 的质数的数量。
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/61/
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if(n < 3) {
            return 0;
        }
        if(n == 3) {
            return 1;
        }
        int count= 0;
        boolean[] mark = new boolean[n];
        mark[2] = false;
        for (int i = 3; i < n; i++) {
            if (i % 2 == 0) {
                mark[i] = true;
            } else {
                mark[i] = false;
            }
        }
        for (int i = 3; i < n; i += 2) {
            if (!mark[i]) {
                if (i * i > n) {
                    break;
                }
                for (int j = 2; i * j < n; ++j) {
                    mark[i * j] = true;
                }
            }


        }
        for(int i=2;i<n;i++) {
            if(!mark[i]) {
                count ++;
            }
        }
        return count;
    }
}
