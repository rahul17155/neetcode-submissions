/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
    //     ListNode temp=head,fast=head;
    //     while(fast!=null && fast.next!=null){
    //         temp=temp.next;
    //         fast=fast.next.next;
    //     }
    //     ListNode prev=null,curr=temp.next,curr_next=null;
    //     while(curr!=null){
    //         curr_next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=curr_next;
    //     }
    //     temp.next=prev;
    //     ListNode dummyNode=new ListNode(-1);
    //     ListNode tmp=dummyNode,tmp1=dummyNode,tmp2=prev;
    //     tmp.next=head;
    //     tmp=head;
    //     while(prev!=null){
    //        tmp=tmp.next;
    //        tmp2=prev.next;
    //        head.next=prev;
    //        prev.next=tmp;
    //        prev=tmp2;
    //        head=tmp;
    //     }
    //     head=tmp1.next;
    // }
    if (head == null || head.next == null)
        return;

    // Find middle
    ListNode slow = head, fast = head;

    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Reverse second half
    ListNode second = slow.next;
    slow.next = null;

    ListNode prev = null;
    while (second != null) {
        ListNode next = second.next;
        second.next = prev;
        prev = second;
        second = next;
    }

    // Merge two halves
    ListNode first = head;
    second = prev;

    while (second != null) {
        ListNode next1 = first.next;
        ListNode next2 = second.next;

        first.next = second;
        second.next = next1;

        first = next1;
        second = next2;
    }
}
}
