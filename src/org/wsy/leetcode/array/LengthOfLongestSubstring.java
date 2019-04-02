package org.wsy.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长无重复子串
 * <p>
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/29/array-and-strings/78/
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        // http://blog.51cto.com/11418774/1845832
        // i 是当前字符位置，i - temp是当前字符串起始位置。出现重复字符时，先判断字符上一次出现位置是否在当前字符串内，
        // 如果不在，则Map中更新位置并且temp++；如果在，则temp截断，从 上一次出现+1 的位置开始计算。
        Map<Character, Integer> pos = new HashMap<>();
        char[] ss = s.toCharArray();

        int max = 0, temp = 0;



        for (int i = 0; i < s.length(); i++) {

            if (!pos.containsKey(ss[i])) {
                pos.put(ss[i], i);
                temp++;
            } else {
                if (pos.get(ss[i]) + temp < i) {
                    temp++;
                } else {
                    max = Math.max(max, temp);
                    temp = i - pos.get(ss[i]);
                }
                pos.put(ss[i], i);
            }

        }
        max = Math.max(max, temp);
        return max;
    }
}
