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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode result = head.next;
        ListNode cur = head;
        ListNode temp;
        ListNode pre = null;
        while(cur != null && cur.next != null){
            if(pre != null){
                pre.next = cur.next;
            }
            temp = cur.next;
            cur.next = temp.next;
            temp.next = cur;
            pre = cur;
            cur = cur.next;
        }
        return result;
    }
}