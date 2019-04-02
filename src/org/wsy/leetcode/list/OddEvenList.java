package org.wsy.leetcode.list;

/**
 * 奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 1->2->3->4->5->NULL
 * 1->3->5->2->4->NULL
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/31/linked-list/83/
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        int i = 1;
        ListNode cur = head;
        ListNode next = head.next;
        ListNode eventHead = head.next;
        while (next!=null) {
            if(next.next!=null) {
                cur.next = next.next;
                cur = next;
                next = next.next;
                i++;
            } else {
                if(i%2 == 0 ) {
                    cur.next = next.next;
                    next.next = eventHead;
                    break;
                } else {
                    cur.next = eventHead;
                    next = next.next;
                    break;
                }
            }
        }
        return head;
    }
}
