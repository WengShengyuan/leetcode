package org.wsy.leetcode.list;

/**
 * 删除链表中的节点
 *
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * 现有一个链表 -- head = [4,5,1,9]，它可以表示为:
 *
 * 输入: head = [4,5,1,9], node = 5
 * 输出: [4,1,9]
 *
 */
public class DeleteNode {
    public void deleteNode(ListNode head, int n) {
        ListNode currentNode = head;
        while(currentNode.getNext() != null) {
            if(currentNode.getNext().getVal() == n) {
                currentNode.setNext(currentNode.getNext().getNext());
                break;
            } else {
                currentNode = currentNode.getNext();
            }
        }
    }
}
