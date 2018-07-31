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
            return -1;
        }

        if(haystack.length() == needle.length()) {
            return haystack.equals(needle)? 0: -1;
        }

        if(needle.length() > haystack.length()) {
            return -1;
        }

        // 正式流程
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        for(int i = 0;i < haystackChars.length - needleChars.length;i++) {
            boolean match = true;
            for(int j = 0; j < needleChars.length ;j ++) {
                if(haystackChars[i+j] != needleChars[j]) {
                    match = false;
                    break;
                }
            }
            if(match) {
                return i;
            }
        }
        return -1;
    }
}