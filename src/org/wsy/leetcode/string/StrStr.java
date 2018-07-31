package org.wsy.leetcode.string;
/**
 * 实现strStr()
 * 
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/38/
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.equals("")) {
            return 0;
        }
        if( haystack == null || haystack.equals("")) {
            return 0;
        }

        if(needle.length() > haystack.length()) {
            return 0;
        }

        return 0;
    }
}