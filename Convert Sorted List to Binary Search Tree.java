/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    static ListNode hea;
    public TreeNode sortedListToBST(ListNode head) {
        int num = 0;
        ListNode p = head;
        hea = head;
        while(p != null){
            num++;
            p = p.next;
        }
        return buildBST(0, num - 1);
    }
    
    TreeNode buildBST(int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode leftN = buildBST(start, mid - 1);
        TreeNode parent = new TreeNode(hea.val);
        parent.left = leftN;
        hea = hea.next;
        parent.right = buildBST(mid + 1, end);
        return parent;
    }
}