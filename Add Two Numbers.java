/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        int carry = 0;
        ListNode head = new ListNode((l1.val + l2.val) % 10);
        carry = (l1.val + l2.val) / 10;
        l1 = l1.next;
        l2 = l2.next;
        ListNode node = head;
        while(l1 != null && l2 != null){
            node.next = new ListNode((l1.val + l2.val + carry) % 10);
            carry = (l1.val + l2.val + carry) / 10;
            node = node.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 == null){
            while(l2 != null){
                node.next = new ListNode((l2.val + carry) % 10);
                carry = (l2.val + carry) / 10;
                node = node.next;
                l2 = l2.next;
            }
        }
        if(l2 == null){
            while(l1 != null){
                node.next = new ListNode((l1.val + carry) % 10);
                carry = (l1.val + carry) / 10;
                node = node.next;
                l1 = l1.next;
            }
        }
        if(carry == 1){
            node.next = new ListNode(1);
        }
        return head;
    }
}