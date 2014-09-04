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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        else{
            return isSymmetric(root.left, root.right);
        }
    }
    
    boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        else if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        else{
            return isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
        }
    }
}