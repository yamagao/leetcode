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
    public boolean hasCycle(ListNode head) {
        if(head ==  null){
            return false;
        }
        ListNode OneStep = head;
        ListNode TwoSteps = head;
        while(true){
            if(OneStep.next != null){
                OneStep = OneStep.next;
            }
            else{
                return false;
            }
            if(TwoSteps.next != null && TwoSteps.next.next != null){
                TwoSteps = TwoSteps.next.next;
            }
            else{
                return false;
            }
            if(OneStep == TwoSteps){
                return true;
            }
        }
    }
}