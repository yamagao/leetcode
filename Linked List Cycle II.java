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
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int count = circleSize(head);
        if(count == 0){
            return null;
        }
        while(count > 0){
            fast = fast.next;
            count--;
        }
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
    
    int circleSize(ListNode head){
        int count = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count ++;
            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return 0;
        }
        else{
            return count;
        }
    }
}