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
    
    int flag;
    
    public void reorderList(ListNode head) {
        ListNode FirHead = head;
        ListNode SecHead = findHead(head);
        SecHead = reverseList(SecHead);
        ListNode FirCur = FirHead;
        ListNode SecCur = SecHead;
        while(SecHead != null){
            FirHead = FirHead.next;
            SecHead = SecHead.next;
            FirCur.next = SecCur;
            if(SecHead ==null && flag == 0){
                SecCur.next = null;
            }
            else{
                SecCur.next = FirHead;
            }
            FirCur = FirHead;
            SecCur = SecHead;
        }
        if(flag == 1){
            FirHead.next = null;
        }
    }

    ListNode findHead(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null){
            flag = 0;
            return slow;
        }
        if(fast.next == null){
            flag = 1;
            return slow.next;
        }
        return null;
    }
    
    ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode first, second, third;
        first = head;
        second = first.next;
        head.next = null;
        while(second.next != null){
            third = second.next;
            second.next = first;
            first = second;
            second = third;
        }
        second.next = first;
        return second;
    }
}