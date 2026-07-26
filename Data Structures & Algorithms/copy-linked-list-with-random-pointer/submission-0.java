/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node copyNode=null;
        if(head==null){
            return copyNode;
        }
        Node dummyNode=new Node(-1);
        Node tmp=dummyNode,tmp1=dummyNode,tmp2=head;
        Map<Node,Node>copyNodepointer=new HashMap<>();
        while(head!=null){
            Node copyNewNode=new Node(head.val);
            tmp.next=copyNewNode;
            tmp=copyNewNode;
            copyNodepointer.put(head,copyNewNode);
            head=head.next;
        }
        tmp.next=null;
        tmp=tmp1.next;
        while(tmp2!=null){
            if(tmp2.random!=null){
                tmp.random=copyNodepointer.get(tmp2.random);
            }
            tmp=tmp.next;
            tmp2=tmp2.next;
        }
        return tmp1.next;

    }
}
