package org.wsy.leetcode.other;

/**
 * 颠倒二进制位
 *
 * 输入: 43261596
 * 输出: 964176192
 * 解释: 43261596 的二进制表示形式为 00000010100101000001111010011100 ，
 * 返回 964176192，其二进制表示形式为 00111001011110000010100101000000 。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/26/others/66/
 */
public class ReverseBits {
    public int reverseBits(int n) {
        //用1指针遍历n的每一位
        int result = 0;
        int cursor = 1;
        for(int i=0;i<32;i++) {
            result = result << 1;
            int cursorValue = n & cursor;// 遍历的那个位
            result = result | cursorValue;
            n = n >> 1;
        }
        return result;
    }
}
