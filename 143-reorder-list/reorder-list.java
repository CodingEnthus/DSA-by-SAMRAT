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
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode head1=head;
        ListNode middle=findMiddle(head);
        ListNode head2=middle.next;
        middle.next=null;
        head2=Reverse(head2);
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        ListNode curr1=head1;
        ListNode curr2=head2;
        while(curr1!=null && curr2!=null){
            tail.next=curr1;
            curr1=curr1.next;
            tail=tail.next;
            tail.next=curr2;
            curr2=curr2.next;
            tail=tail.next;
        }
        if(curr1 !=null){
            tail.next=curr1;
        }if(curr2 !=null){
            tail.next=curr2;
        }
        head=dummy.next;
        
    }
}