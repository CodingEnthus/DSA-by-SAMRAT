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
    public ListNode reverseList(ListNode head){
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
    public void reorderList(ListNode head) {
        ListNode curr=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode middle=slow;
        ListNode SecondHead=middle.next;
        SecondHead=reverseList(SecondHead);
        middle.next=null;
        ListNode dummy=new ListNode(-1);
        ListNode curr1=head;
        ListNode curr2=SecondHead;
        ListNode ans=dummy;
        while(curr1!=null && curr2!=null){
            ans.next=curr1;
            ans=ans.next;
            curr1=curr1.next;
            ans.next=curr2;
            curr2=curr2.next;
            ans=ans.next;
        }
        if(curr1!=null){
            ans.next=curr1;
        }
        if(curr2!=null){
            ans.next=curr2;
        }
        head=dummy.next;
        
    }
}