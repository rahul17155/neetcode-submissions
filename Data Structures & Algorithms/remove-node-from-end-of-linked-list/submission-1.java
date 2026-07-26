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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //       int size=0;
    //       ListNode tmp=head,tmp1=head,tmp2=head;
    //       while(tmp!=null){
    //         tmp=tmp.next;
    //         size++;
    //       }
    //       n=size-n;
    //       if(n==0) return head.next;
    //       for(int i=0;i<n-1;i++){
    //            tmp1=tmp1.next;
    //       }
    //       if(tmp1.next.next!=null){
    //         tmp2=tmp1.next;
    //         tmp1.next=tmp1.next.next;
    //         tmp2.next=null;
    //       }else{
    //         tmp1.next=null;
    //       }
    //       return head;
    // }

    //Single Pass
    ListNode slow=head,fast=head;
    for(int i=0;i<n;i++){
        fast=fast.next;
    }
    if(fast==null) return head.next;
    while(fast.next!=null){
        fast=fast.next;
        slow=slow.next;
    }
    ListNode targetNode=slow.next;
    if(slow.next.next!=null){
        slow.next=slow.next.next;
        targetNode.next=null;
    }
    else{
        slow.next=null;
    }
    return head;
    }
}
