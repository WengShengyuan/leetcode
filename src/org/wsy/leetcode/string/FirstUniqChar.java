package org.wsy.leetcode.string;
/**
 * 字符串中的第一个唯一字符
 * 
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 
 * s = "loveleetcode",
 * 返回 2.
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/34/ 
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        if(s == null || "".equals(s)) {
            return -1;
        } else {
            char[] chars = s.toCharArray();
            int[] nums = new int[chars.length];
            for(int i=0;i<chars.length;i++) {
                nums[i] = (int) chars[i];
            }
            boolean[] mirror = new boolean[nums.length];
            for(int i=0;i<nums.length;i++) {
                boolean match = false;
                for(int j=0;j<nums.length;j++) {
                    if(i != j && nums[i] == nums[j]) {
                        match = true;
                        break;
                    }
                }
                mirror[i] = match;          
            }
            for(int i=0;i<nums.length;i++) {
                if(!mirror[i]) {
                    return i;
                }
            }
            return -1;
        }
    }
}