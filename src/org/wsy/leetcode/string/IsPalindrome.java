package org.wsy.leetcode.string;

import java.util.LinkedList;
import java.util.List;
import java.lang.Character;
/**
 * 验证回文字符串
 * 
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/36/
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            boolean isPalindrome = true;
            s = s.toLowerCase();
            int i = 0;
            int j = s.length() - 1;
            int length = s.length();
            while (i < j) {
                while (i < length && !isChar(s.charAt(i))) {
                    i++;
                }
                while (j >= 0 && !isChar(s.charAt(j))) {
                    j--;
                }
                if(i <= j) {
                    System.out.println("i:"+i+" j:"+j+", "+s.charAt(i)+", "+s.charAt(j));
                    if(s.charAt(i) == s.charAt(j)) {
                        isPalindrome = true;
                    } else {
                        isPalindrome = false;
                        break;
                    }
                } else {
                    return isPalindrome;
                }
                i++;
                j--;
            }
            return isPalindrome;
        }
    }

    private boolean isChar(char c) {
        return (('a' <= c && 'z'>= c) || ('0' <= c && '9' >= c));
    }

}