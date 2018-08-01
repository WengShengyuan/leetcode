package org.wsy.leetcode.list;

import java.util.Stack;

/**
 * 回文链表
 * <p>
 * 请判断一个链表是否为回文链表。
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/45/
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        int lenth = 0;
        ListNode current = head;
        while (current != null) {
            lenth++;
            current = current.next;
        }


        if(lenth % 2 != 0) {
            int index= lenth /2;
            lenth = 1;
            current = head;
            while(current != null) {
                if(lenth == index) {
                    current.next = current.next.next;
                    current = current.next;
                } else {
                    current = current.next;
                }
                lenth ++ ;
            }
        }

        current = head;
        Stack<Integer> probe = new Stack<>();
        while (current != null) {
            if (probe.empty()) {
                probe.push(current.val);
            } else if (probe.peek() != current.val) {
                probe.push(current.val);
            } else {
                probe.pop();
            }
            current = current.next;
            lenth ++ ;
        }
        return probe.empty();
    }
}
