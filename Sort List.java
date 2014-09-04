/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        slow = sortList(head);
        fast = sortList(fast);
        return merge(slow,fast);
    }
    
    public ListNode merge(ListNode slow, ListNode fast){
        ListNode head = new ListNode(0);
        ListNode p = head;
        while(slow != null && fast != null){
            if(slow.val < fast.val){
                p.next = slow;
                p = p.next;
                slow = slow.next;
            }
            else{
                p.next = fast;
                p = p.next;
                fast = fast.next;
            }
        }
        if(slow == null){
            p.next = fast;
        }
        if(fast == null){
            p.next = slow;
        }
        return head.next;
    }
}