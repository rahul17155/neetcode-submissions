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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        ListNode tmp1=lists[0];
        for(int i=1;i<lists.length;i++){
            tmp1=mergeLists(tmp1,lists[i]);
        }
        return tmp1;
    }
    public ListNode mergeLists(ListNode list1,ListNode list2){
        ListNode dummyNode=new ListNode(-1);
        ListNode tmp=dummyNode;
        while(list1!=null && list2!=null){
             if(list1.val<=list2.val){
                tmp.next=list1;
                tmp=list1;
                list1=list1.next;
             }else{
                tmp.next=list2;
                tmp=list2;
                list2=list2.next;
             }
        }
        while(list1!=null){
            tmp.next=list1;
            tmp=list1;
            list1=list1.next;
        }
        while(list2!=null){
            tmp.next=list2;
            tmp=list2;
            list2=list2.next;
        }
        return dummyNode.next;
    }
}
