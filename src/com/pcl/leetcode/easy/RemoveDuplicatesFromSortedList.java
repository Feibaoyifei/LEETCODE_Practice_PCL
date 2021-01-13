package com.pcl.leetcode.easy;

public class RemoveDuplicatesFromSortedList {




      class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode deleteDuplicates(ListNode head) {
        /* //解法1
          if(head==null||head.next==null)
              return head;
          ListNode i=head,j=head.next;
          while (j!=null){
              if(j.val==i.val)
                  j=j.next;
              else {
                  i=i.next;
                  i.val=j.val;
                  j=j.next;
              }
          }
          i.next=null;

return head;*/
        //解法二 与解法一性能差距不大
        if(head==null||head.next==null)
            return head;
        ListNode i=head,j=head;
        while (j!=null){
            if(j.val==i.val)
                j=j.next;
            else {
                i.next=j;
               i=i.next;
                j=j.next;
            }
        }
        i.next=null;

        return head;


    }



}
