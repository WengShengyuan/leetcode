package org.wsy.leetcode.list;

public class NodeFactory {

    public static ListNode build(int[] nums) {
        if (nums == null || nums.length < 1) {
            return null;
        } else {
            ListNode head = null;
            ListNode current = null;
            for (int n : nums) {
                if (head == null) {
                    head = new ListNode(n);
                    current = head;
                } else {
                    current.next = new ListNode(n);
                    current = current.next;
                }
            }
            return head;
        }
    }
}
