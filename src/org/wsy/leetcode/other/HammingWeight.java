package org.wsy.leetcode.other;

/**
 * 位1的个数
 *
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/26/others/64/
 */
public class HammingWeight {

    public int hammingWeight(long n) {
        int tag = 1;
        int count = 0;
        while (tag != 0) {//由于int类型的函数是32位因此要循环32次
            if ((n & tag) != 0)
                count++;
            tag = tag << 1;

        }
        return count;
    }
}
