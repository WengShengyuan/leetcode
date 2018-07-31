package org.wsy.leetcode.string;
/**
 * 反转字符串
 * 
 * 请编写一个函数，其功能是将输入的字符串反转过来。 输入：s = "hello" 返回："olleh"
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/32/
 */
public class ReverseString {
    public String reverseString(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        char[] chars = s.toCharArray();
        int length = chars.length;

        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = chars[length - i - 1];
        }
        return String.valueOf(result);
    }
}