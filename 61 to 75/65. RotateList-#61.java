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
        if(head==null || head.next==null || k==0) return head;
        ListNode end = head;
        int sz = 1;
        while(end.next!=null){
            sz++;
            end = end.next;
        }
        k = k%sz;
        if(k==0) return head;
        ListNode temp = head;
        for(int i=0;i<sz-k-1;i++){
            temp = temp.next;
        }
        ListNode nStart = temp.next;
        temp.next = null;
        end.next = head;
        return nStart;
    }
}
