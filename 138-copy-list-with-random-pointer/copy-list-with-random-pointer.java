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
        if(head==null) return head;
        HashMap<Node,Node> map=new HashMap<>();
        Node newHead=new Node(head.val);
        map.put(head,newHead);
        Node curr=head.next;
        Node newCurr=newHead;
        while(curr!=null){
            Node newCopy=new Node(curr.val);
            map.put(curr,newCopy);
            newCurr.next=newCopy;
            curr=curr.next;
            newCurr=newCurr.next;
        }
        curr=head;
        newCurr=newHead;
        while(curr!=null){
            newCurr.random=map.get(curr.random);
            newCurr=newCurr.next;
            curr=curr.next;
        }
        return newHead;
    }
}