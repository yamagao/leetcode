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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        while(n > 0){
            first = first.next;
            n--;
        }
        if(first == null){
            return head.next;
        }
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }
}