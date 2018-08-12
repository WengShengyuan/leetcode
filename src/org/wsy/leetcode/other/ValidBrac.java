package org.wsy.leetcode.other;

import java.util.Stack;

/**
 * 有效的括号
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/26/others/68/
 */
public class ValidBrac {
    public boolean isValid(String s) {

        if (s == null || s.length() == 1) {
            return false;
        }
        if(s.length() == 1 && "".equals(s)) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();

    }
}
