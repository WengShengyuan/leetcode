package org.wsy.leetcode.string;

import java.util.LinkedList;
import java.util.List;
import java.lang.Character;
/**
 * 字符串转整数（atoi）
 * 
 * 实现 atoi，将字符串转为整数。
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这
 * 部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * 若函数不能执行有效的转换，返回 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。如果数值超过可表示的范围，则返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 
 * 
 * 输入: "42"
 * 输出: 42
 * 
 * 输入: "   -42"
 * 输出: -42
 * 
 * 输入: "words and 987"
 * 输出: 0
 * 
 * 输入: "4193 with words"
 * 输出: 4193
 * 
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/37/
 */
public class MyAtoi {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        boolean getFirst = false;
        boolean isNegative = false;
        StringBuilder sb = new StringBuilder();
        for(char c: chars) {
            if(' '==c) {
                if(getFirst) {
                    break;
                } else {
                    continue;
                }
            } else {
                if(('-' == c)) {
                    if(getFirst) {
                        break;
                    } else {
                        isNegative = true;
                        // sb.append(c);
                        getFirst = true;
                    }
                } else if('+' == c) {
                    if(getFirst) {
                        break;
                    } else {
                        getFirst = true;
                    }
                } else if('0'<= c && '9'>= c) {
                    if(getFirst) {
                        sb.append(c);
                    } else {
                        sb.append(c);
                        getFirst = true;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(sb.toString());
        if(sb.length() < 1) {
            return 0;
        }
        try {
            if(isNegative) {
                return -1 * Integer.valueOf(sb.toString());
            } else {
                return Integer.valueOf(sb.toString());
            }
        } catch(Exception e) {
            if(isNegative) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        
    }
}