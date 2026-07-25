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
    public ListNode Reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head=Reverse(head);
        if(head==null){
            return head;
        }
        ListNode curr=head;
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        prev.next=curr;
        int k=1;
        while(curr!=null && k!=n){
            prev=curr;
            curr=curr.next;
            k++;
        }
        prev.next=curr.next;
        return Reverse(dummy.next);
    }
}