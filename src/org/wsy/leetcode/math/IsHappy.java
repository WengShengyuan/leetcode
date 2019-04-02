package org.wsy.leetcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * 快乐数
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/53/math/112/
 */
public class IsHappy {
    public boolean isHappy(int n) {
        if(n == 1) {
            return true;
        } else {
            String source = String.valueOf(n);
            Map<String, Integer> map = new HashMap<String, Integer>();
            while(!map.containsKey(source)) {
                map.put(source,1);
                source = generateNext(source);

                if("1".equalsIgnoreCase(source)) {
                    return true;
                }
            }
            return false;
        }
    }

    private String generateNext(String source){
        char[] orig = source.toCharArray();
        int result = 0;
        for(char c: orig){
            result += Math.pow((c-'0'),2);
        }
        System.out.println(source + "->"+result);
        return String.valueOf(result);
    }
}
