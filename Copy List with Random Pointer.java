/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return null;
        }
        RandomListNode n = head;
        while(n != null){
            RandomListNode newNode = new RandomListNode(n.label);
            newNode.next = n.next;
            n.next = newNode;
            n = newNode.next;
        }
        n = head;
        while(n != null){
            if(n.random == null){
                n.next.random = null;
                n = n.next.next;
                continue;
            }
            n.next.random = n.random.next;
            n = n.next.next;
        }
        n = head;
        RandomListNode newHead = head.next;
        RandomListNode newNode = newHead;
        while(newNode != null && newNode.next != null){
            n.next = newNode.next;
            n = n.next;
            newNode.next = n.next;
            newNode = newNode.next;
        }
        n.next = null;
        return newHead;
    }
}