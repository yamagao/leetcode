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
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left == null){
            flatten(root.right);
            return;
        }
        TreeNode cur = root.left;
        while(cur.left != null || cur.right != null){
            if(cur.right != null){
                cur = cur.right;
                continue;
            }
            if(cur.left != null){
                cur = cur.left;
            }
        }
        cur.right= root.right;
        root.right = root.left;
        root.left = null;
        flatten(root.right);
    }
}