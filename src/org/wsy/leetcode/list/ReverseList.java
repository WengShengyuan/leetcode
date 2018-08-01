package org.wsy.leetcode.list;

/**
 * 反转链表
 *
 * 反转一个单链表。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/43/
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        head.next = null;

        while(current.next != null) {
            ListNode tmpNext = current.next;
            current.next = prev;
            prev = current;
            current = tmpNext;
        }
        current.next = prev;
        return current;
    }
}
