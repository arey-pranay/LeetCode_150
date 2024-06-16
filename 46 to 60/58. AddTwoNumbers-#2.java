/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val; // value ko store karne ke liye
 *     ListNode next; // next node ko point karne ke liye
 *     ListNode() {} // constructor
 *     ListNode(int val) { this.val = val; } // constructor
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; } // constructor
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head= new ListNode(-1);
        ListNode temp= head;
        while(l1!= null || l2!= null || carry==1){
            int sum=0;
            if(l1!= null){
                sum+= l1.val;
                l1= l1.next;
            }
            if(l2!= null){
                sum+= l2.val;
                l2= l2.next;
            }
            sum+=carry;
            carry= sum/10;
            ListNode t= new ListNode(sum%10);
            temp.next=t;
            temp= temp.next;
        }
        return head.next;

        
    }
}

// import java.math.BigInteger;
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         if(l1.val==0 && l2.val==0 && l1.next==null && l2.next==null) return new ListNode(0);
//         BigInteger num1 = new BigInteger("0");
//         BigInteger num2 = new BigInteger("0");
//         int pow1 = 0;
//         int pow2 = 0;

//         ListNode temp1 = l1;
//         ListNode temp2 = l2;

//         while (temp1 != null) {
//             num1 = num1.add(BigInteger.valueOf(temp1.val).multiply(BigInteger.TEN.pow(pow1)));
//             pow1++;
//             temp1 = temp1.next;
//         }

//         while (temp2 != null) {
//             num2 = num2.add(BigInteger.valueOf(temp2.val).multiply(BigInteger.TEN.pow(pow2)));
//             pow2++;
//             temp2 = temp2.next;
//         }

//         BigInteger sum = num1.add(num2);
//         ListNode dummyHead = new ListNode();
//         ListNode temp = dummyHead;

//         while (!sum.equals(BigInteger.ZERO)) {
//             int digit = sum.mod(BigInteger.TEN).intValue();
//             temp.next = new ListNode(digit);
//             temp = temp.next;
//             sum = sum.divide(BigInteger.TEN);
//         }

//         return dummyHead.next;
//     }
// }
