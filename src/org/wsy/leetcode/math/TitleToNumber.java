package org.wsy.leetcode.math;

/**
 * Excel表列序号
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/53/math/114/
 */
public class TitleToNumber {
    public int titleToNumber(String s) {
        char[] arr = s.toCharArray();
        int result = 0;;
        for(int i=0;i<arr.length;i++) {
            result += Math.pow(26,(arr.length - i-1)) * countOne(arr[i]);
        }
        return result;
    }

    private int countOne(char a) {
        return a - 'A' + 1;
    }
}
