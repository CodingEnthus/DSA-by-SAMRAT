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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        int l=0;
        ListNode t=head;
        if(head==null || head.next==null) return head;
        while(t!=null){
            t=t.next;
            l++;
        }
        ListNode left=head;
        for(int i=1;i<k;i++){
            left=left.next;
        }
        ListNode right=head;
        for(int i=1;i<l-k+1;i++){
            right=right.next;
        }
        System.out.print("Left:"+left.val);
        System.out.print("Right:"+right.val);
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
        return head;

    }
    
}