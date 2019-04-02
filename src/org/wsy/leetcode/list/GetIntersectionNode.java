package org.wsy.leetcode.list;

/**
 * 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 * 如果两个链表没有交点，返回 null.
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/31/linked-list/84/
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        if(cur1 == null || cur2 == null) {return null;}
        while ( cur1 != cur2) {
            if(cur1 == null) {cur1 = headB;}
            else {cur1 = cur1.next;}

            if(cur2 == null) {cur2 = headA;}
            else {cur2 = cur2.next;}
        }
        return cur1;

    }
}
