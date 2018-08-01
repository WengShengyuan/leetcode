package org.wsy.leetcode.list;

/**
 * 合并两个有序链表
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/44/
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode c1, c2, head = null, current = null;
        if (l1.val <= l2.val) {
            c1 = l1;
            c2 = l2;
            head = new ListNode(c1.val);
            current = head;
            c1 = c1.next;
        } else {
            c2 = l1;
            c1 = l2;
            head = new ListNode(c1.val);
            current = head;
            c1 = c1.next;
        }

        while (c1 != null && c2 != null) {
            if (c1.val < c2.val) {
                current.next = new ListNode(c1.val);
                current = current.next;
                c1 = c1.next;
            } else {
                current.next = new ListNode(c2.val);
                current = current.next;
                c2 = c2.next;
            }
        }

        if (c1 == null && c2 == null) {
            return head;
        } else if (c1 == null) {
            while (c2 != null) {
                current.next = new ListNode(c2.val);
                current = current.next;
                c2 = c2.next;
            }
        } else {
            while (c1 != null) {
                current.next = new ListNode(c1.val);
                current = current.next;
                c1 = c1.next;
            }
        }
        return head;
    }

}
