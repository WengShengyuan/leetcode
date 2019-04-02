package org.wsy.leetcode.list;

/**
 * 两数相加
 * <p>
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 342 + 465 = 807
 * <p>
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/31/linked-list/82/s
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int p = 0;// power of ten
        boolean shouldAddOne = false;
        ListNode node = null;
        ListNode currentNode = null;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                int current = l1.val + l2.val;
                if (shouldAddOne) {
                    current += 1;
                }
                if (current > 9) {
                    shouldAddOne = true;
                    current = current - 10;
                } else {
                    shouldAddOne = false;
                }
                if (node == null) {
                    node = new ListNode(current );
                    currentNode = node;
                } else {
                    currentNode.next = new ListNode(current );
                    currentNode = currentNode.next;
                }
                p++;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                int current = l1.val;
                if (shouldAddOne) {
                    current += 1;
                }
                if (current > 9) {
                    shouldAddOne = true;
                    current = current - 10;
                } else {
                    shouldAddOne = false;
                }
                if (node == null) {
                    node = new ListNode(current);
                    currentNode = node;
                } else {
                    currentNode.next = new ListNode(current);
                    currentNode = currentNode.next;
                }
                p++;
                l1 = l1.next;
            } else {
                int current = l2.val;
                if (shouldAddOne) {
                    current += 1;
                }
                if (current > 9) {
                    shouldAddOne = true;
                    current = current - 10;
                } else {
                    shouldAddOne = false;
                }
                if (node == null) {
                    node = new ListNode(current );
                    currentNode = node;
                } else {
                    currentNode.next = new ListNode(current );
                    currentNode = currentNode.next;
                }
                p++;
                l2 = l2.next;
            }
        }
        if(shouldAddOne) {
            currentNode.next = new ListNode(1);
        }
        return node;
    }
}