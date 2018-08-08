package org.wsy.leetcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/63/
 */
public class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap<String, Integer>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        if (s == null || s.length() < 1) {
            return 0;
        } else if (s.length() == 1) {
            return romanMap.get(s);
        } else {
            int result = 0;
            char[] array = s.toCharArray();
            for (int i=0;i<array.length;i++) {
                if(i == array.length-1 || romanMap.get(String.valueOf(array[i+1])) <= romanMap.get(String.valueOf(array[i]))) {
                    result += romanMap.get(String.valueOf(array[i]));
                } else {
                    result -= romanMap.get(String.valueOf(array[i]));
                }
            }
            return result;
        }
    }
}
