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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        k=k%length;
        tail.next=head;
        ListNode curr=head;
        for(int i=0;i<length-k-1;i++){
            curr=curr.next;
        }
        ListNode newTail=curr;
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
}
}