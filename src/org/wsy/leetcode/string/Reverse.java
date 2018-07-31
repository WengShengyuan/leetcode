package org.wsy.leetcode.string;
/**
 * 颠倒整数
 * 
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 
 * 输入: 123
 * 输出: 321
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/33/
 */
public class Reverse {
    public int reverse(int x) {
        try {
            if(x> -10 && x < 10) {
                return x;
            } else if(x >= 10) {
                // 10 ->
                String numStr = x + "";
                char[] chars = numStr.toCharArray();
                int length = chars.length;
    
                char[] result = new char[length];
                for (int i = 0; i < length; i++) {
                    result[i] = chars[length - i - 1];
                }
                numStr = String.valueOf(result);
                return Integer.valueOf(numStr);
            } else {
                // <- -10
                x = x * -1;
                String numStr = x + "";
                char[] chars = numStr.toCharArray();
                int length = chars.length;
    
                char[] result = new char[length];
                for (int i = 0; i < length; i++) {
                    result[i] = chars[length - i - 1];
                }
                numStr = String.valueOf(result);
                return Integer.valueOf(numStr) * -1;
            }
        } catch(Exception e) {
            return 0;
        }
    }
}