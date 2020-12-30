package com.pcl.leetcode.easy;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode p = l1, q = l2, temp = head;
        while (p != null && q != null) {
            if (p.val > q.val) {
                temp.next = q;
                q = q.next;

            } else {
                temp.next = p;
                p = p.next;
            }
            temp = temp.next;


        }
        if (p == null)
            temp.next = q;
        else temp.next = p;
        return head.next;

    }

}
