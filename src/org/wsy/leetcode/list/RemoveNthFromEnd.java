package org.wsy.leetcode.list;

/**
 * 删除链表的倒数第N个节点
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/42/
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        System.out.println(head);
        int length = 1;
        ListNode current = head;
        while(current.next != null) {
            length++;
            current = current.next;
        }
        int removeNum = length - n + 1;
        System.out.println(length + "," + removeNum);
        if(removeNum == 1) {
            return head.next;
        }
        length = 1;
        current = head;

        while(true && current != null) {
            if(length == removeNum - 1) {
                current.next = current.next.next;
                return head;
            } else {
                length ++;
                current = current.next;
            }
        }
        return head;
    }
}
