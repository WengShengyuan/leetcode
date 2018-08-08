package org.wsy.leetcode.other;

/**
 * 汉明距离
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 输入: x = 1, y = 4
 * 输出: 2
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/26/others/65/
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int dif = (x ^ y);
        int tag = 1;
        int count = 0;
        while (tag != 0) {//由于int类型的函数是32位因此要循环32次
            if ((dif & tag) != 0)
                count++;
            tag = tag << 1;

        }
        return count;
    }
}
