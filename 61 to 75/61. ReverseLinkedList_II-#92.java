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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Create a dummy node to handle edge cases easily
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move `prev` to the node before `left`
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // `start` will point to the first node in the sublist to be reversed
        ListNode start = prev.next;
        // `then` will point to the node that will be reversed
        ListNode then = start.next;

        // Perform the sublist reversal
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}
