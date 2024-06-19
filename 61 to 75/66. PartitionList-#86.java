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
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        ListNode lesserH = new ListNode();
        ListNode greaterH = new ListNode();
        ListNode lTemp = lesserH;
        ListNode gTemp = greaterH;
        while(temp!=null){
            if(temp.val<x){
                lTemp.next = temp;
                lTemp = lTemp.next;
            } else {
                gTemp.next = temp;
                gTemp = gTemp.next;
            }
            temp = temp.next;
        }
        lTemp.next = greaterH.next;
        gTemp.next = null;
        return lesserH.next;
    }
}
