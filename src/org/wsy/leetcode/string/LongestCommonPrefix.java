package org.wsy.leetcode.string;

/**
 * 最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/40/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) {
            return strs[0];
        }
        String longest = "";
        for(String str:strs) {
            if(str.length() > longest.length()) {
                longest = str;
            }
        }
        String result = "";
        int length = longest.length() + 1;
        for(int i=0;i < length;i ++ ) {
            if(!allStartWith(longest.substring(0,i),strs)) {
                break;
            } else {
                result = longest.substring(0,i);
            }
        }
        return result;
    }

    private boolean allStartWith(String prefix, String[] strs) {
        for(String str: strs) {
            if(!str.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }
}
