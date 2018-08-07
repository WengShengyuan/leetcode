package org.wsy.leetcode.math;

import java.util.LinkedList;
import java.util.List;

/**
 * Fizz Buzz
 *
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/60/
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<String>();
        if(n == 0) {
            return result;
        }
        for(int i=1;i<n+1;i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if(i % 3 == 0) {
                result.add("Fizz");
            } else if(i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
