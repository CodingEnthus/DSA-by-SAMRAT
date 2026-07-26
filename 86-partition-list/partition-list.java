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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-2);
        ListNode l=dummy1;
        ListNode g=dummy2;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                l.next=curr;
                l=l.next;
            }else{
                g.next=curr;
                g=g.next;
            }
            curr=curr.next;
        }
        l.next=dummy2.next;
        g.next=null;
        return dummy1.next;
    }
}