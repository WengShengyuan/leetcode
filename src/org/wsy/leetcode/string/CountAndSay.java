package org.wsy.leetcode.string;

import java.util.LinkedList;
import java.util.List;

/**
 * 数数并说
 *
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *  1
 *  11
 *  21
 *  1211
 *  111221
 *  1 被读作  "one 1"  ("一个一") , 即 11。
 *  11 被读作 "two 1s" ("两个一"）, 即 21。
 *  21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *  给定一个正整数 n ，输出报数序列的第 n 项。
 *  注意：整数顺序将表示为一个字符串。
 *
 *  输入: 1
 *  输出: "1"
 *
 *  输入: 4
 *  输出: "1211"
 *
 *  https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/39/
 */
public class CountAndSay {

    public String countAndSay(int n) {
        char[] chars = new char[] {'1'};
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++) {
            if(i == n-1) {
                for(char c: chars) {
                    sb.append(c);
                }
            } else {
                chars = generateNext(chars);
            }
        }
        return sb.toString();
    }

    private char[] generateNext(char[] chars) {
        char currentChar = chars[0];
        int count = 1;
        List<Character> list = new LinkedList<Character>();
        boolean lastProcessed =false;
        for(int i=1;i<chars.length ;i++) {
            if(chars[i]== currentChar) {
                count ++;
            } else {
                list.add(Character.forDigit(count,10));
                list.add(currentChar);
                count = 1;
                currentChar = chars[i];

            }
        }
        if(!lastProcessed) {
            list.add(Character.forDigit(count,10));
            list.add(currentChar);
        }
        char[] result = new char[list.size()];
        int size = list.size();
        for(int i=0;i<size;i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
