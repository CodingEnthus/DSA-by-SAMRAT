class LRUCache {
    public class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int key,int val){
            this.key=key;
            this.val=val;
            prev=next=null;
        }
    }
    Node head;
    Node tail;
    int capacity;
    HashMap<Integer,Node> map;
    void addNode(Node newNode){
        Node oldNext=head.next;
        head.next=newNode;
        newNode.next=oldNext;
        oldNext.prev=newNode;
        newNode.prev=head;
    }
    void delNode(Node newNode){
        newNode.prev.next=newNode.next;
        newNode.next.prev=newNode.prev;
    }
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node ans=map.get(key);
        //to make it MRU
        delNode(ans);
        addNode(ans);
        return ans.val;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            delNode(node);
            addNode(node);
        }else{
            if(map.size()==capacity){
                Node lru=tail.prev;
                delNode(lru);
                map.remove(lru.key);
            }
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            addNode(newNode);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */