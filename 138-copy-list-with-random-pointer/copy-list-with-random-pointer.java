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
        HashMap<Node,Node> map=new HashMap<>();
        if(head==null) return head;
        Node curr=head.next;
        Node newHead=new Node(head.val);
        Node newCurr=newHead;
        map.put(head,newHead);
        while(curr!=null){
            Node newCopy=new Node(curr.val);
            newCurr.next=newCopy;
            map.put(curr,newCopy);
            curr=curr.next;
            newCurr=newCurr.next;
        }
        curr=head;
        newCurr=newHead;
        while(curr!=null){
            newCurr.random=map.get(curr.random);
            curr=curr.next;
            newCurr=newCurr.next;
        }
        return newHead;

    }
}