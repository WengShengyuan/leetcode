package org.wsy.leetcode.list;

/**
 * 环形链表
 *
 * 给定一个链表，判断链表中是否有环。
 * 你能否不使用额外空间解决此题？
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/46/
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode current = head;
        ListNode current2 = head.next;
        while(current != null && current2 != null) {
            if(current == current2) {
                return true;
            }
            current = oneStep(current);
            current2 = twoStep(current2);
        }

        return false;
    }

    private ListNode oneStep(ListNode cur) {
        return cur.next;
    }

    private ListNode twoStep(ListNode cur) {
        if(cur.next != null) {
            return cur.next.next;
        }else {
            return null;
        }
    }

}
