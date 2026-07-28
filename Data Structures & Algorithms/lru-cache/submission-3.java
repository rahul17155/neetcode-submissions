class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    Map<Integer,Node>LRUMap;
    int capacity;
    Node head,tail;
    public LRUCache(int capacity) {
        LRUMap=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(LRUMap.containsKey(key)){
            Node tmp=LRUMap.get(key).prev;
            tmp.next=LRUMap.get(key).next;
            LRUMap.get(key).next.prev=tmp;
            LRUMap.get(key).next=tail;
            tail.prev.next=LRUMap.get(key);
            LRUMap.get(key).prev=tail.prev;
            tail.prev=LRUMap.get(key);
            return LRUMap.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(LRUMap.containsKey(key)){
            LRUMap.get(key).value=value;
            Node tmp=LRUMap.get(key).prev;
            tmp.next=LRUMap.get(key).next;
            LRUMap.get(key).next.prev=tmp;
            LRUMap.get(key).next=tail;
            tail.prev.next=LRUMap.get(key);
            LRUMap.get(key).prev=tail.prev;
            tail.prev=LRUMap.get(key);
            return;
        }
        if(LRUMap.size()==capacity){
            Node tmp=head.next;
            LRUMap.remove(tmp.key);
            head.next=tmp.next;
            tmp.next.prev=head;
        }
        Node node=new Node(key,value);
        Node tmp=tail.prev;
        tmp.next=node;
        node.next=tail;
        node.prev=tmp;
        tail.prev=node;
        LRUMap.put(key,node);
    }
}
