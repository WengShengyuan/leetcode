package org.wsy.leetcode.design;

import java.util.Stack;

/**
 * 最小栈
 *
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/24/design/59/
 */
public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public MinStack() {

    }

    public void push(int x) {
        if(minStack.isEmpty()) {
            minStack.push(x);
        } else if(minStack.peek() >= x) {
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
