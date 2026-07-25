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
    public boolean hasCycle(ListNode head) {
        ListNode curr=head,fast=head;
        if(head==null || head.next==null || head.next.next==null){
            return false;
        }
        while(curr!=null && fast!=null && fast.next!=null){
            curr=curr.next;
            fast=fast.next.next;
            if(curr==fast){
                return true;
            }
        }
        return false;
    }
}
