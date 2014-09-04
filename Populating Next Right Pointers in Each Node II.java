/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
        TreeLinkNode cur = root.next;
        while(cur != null){
            if(cur.left != null){
                cur = cur.left;
                break;
            }
            if(cur.right != null){
                cur = cur.right;
                break;
            }
            cur = cur.next;
        }
        if(root.right != null){
            root.right.next = cur;
        }
        if(root.left != null){
            root.left.next = root.right != null? root.right : cur;
        }
        connect(root.right);
        connect(root.left);
    }
}