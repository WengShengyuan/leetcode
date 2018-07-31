package org.wsy.leetcode.array;

/**
 * 加一
 * 
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。 你可以假设除了整数
 * 0 之外，这个整数不会以零开头。
 * 
 * 输入: [1,2,3] 输出: [1,2,4] 解释: 输入数组表示数字 123。
 * 
 * 输入: [4,3,2,1] 输出: [4,3,2,2] 解释: 输入数组表示数字 4321。
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[] { 1 };
        } else {
            int length = digits.length;
            if (isAllNine(digits)) {
                int[] result = new int[length + 1];
                result[0] = 1;
                for (int i = 1; i < length + 1; i++) {
                    result[i] = 0;
                }
                return result;
            } else {
                int[] result = new int[length];
                boolean needAdd = false;
                // 最后一位
                if (digits[length - 1] == 9) {
                    result[length - 1] = 0;
                    needAdd = true;
                } else {
                    result[length - 1] = digits[length - 1] + 1;
                }

                for (int i = length - 2; i >= 0; i--) {
                    if (needAdd) {
                        if (digits[i] == 9) {
                            result[i] = 0;
                            needAdd = true;
                        } else {
                            result[i] = digits[i] + 1;
                            needAdd = false;
                        }
                    } else {
                        result[i] = digits[i];
                    }
                }
                return result;
            }
        }
    }

    private boolean isAllNine(int[] digits) {
        for (int num : digits) {
            if (num != 9) {
                return false;
            }
        }
        return true;
    }
}