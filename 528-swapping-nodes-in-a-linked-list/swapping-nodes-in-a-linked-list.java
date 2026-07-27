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
        ListNode first = head;
        ListNode second = head;
        ListNode curr = head;

        // Move curr to the kth node
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        // Save the kth node from the beginning
        first = curr;

        // Move curr to the end
        // Move second simultaneously
        while (curr.next != null) {
            curr = curr.next;
            second = second.next;
        }

        // Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}