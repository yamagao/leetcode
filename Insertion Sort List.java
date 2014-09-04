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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        ListNode before = head;
        ListNode temp = head;
        while(p != null && p.next != null){
            if(p.next.val < p.val){
                temp = p.next;
                p.next = p.next.next;
                if(temp.val < before.val){
                    temp.next = before;
                    head = temp;
                }
                else{
                    while(before.next != null && temp.val > before.next.val){
                        before = before.next;
                    }
                    temp.next = before.next;
                    before.next = temp;
                }
                before = head;
            }
            else{
                p = p.next;
            }
        }
        return head;
    }
}