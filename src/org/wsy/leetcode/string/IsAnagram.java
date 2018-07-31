package org.wsy.leetcode.string;

import java.util.Arrays;
/**
 * 有效的字母异位词
 * 
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/35/
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        } else if(s.length() == 1) {
            return s.equals(t);
        } else {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            for(int i = 0;i<sChars.length;i++) {
                if(sChars[i] != tChars[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}