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
        if(head==null || head.next==null) return null;
        ListNode prev=new ListNode(-1);
        ListNode curr=head;
        prev.next=curr;
        ListNode left=curr;
        ListNode right=curr;
        int k=0;
        while(k<n){
            right=right.next;
            k++;
        }
        if(right==null){
            return head.next;
        }
        while(right!=null){
            prev=left;
            left=left.next;
            right=right.next;
        }
        prev.next=left.next;
        return head;
    }
}