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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int val = getbalance(root);
        if(val == -1){
            return false;
        }
        return true;
    }
    int getbalance(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getbalance(root.left);
        if(left == -1){
            return -1;
        }
        int right = getbalance(root.right);
        if(right == -1){
            return -1;
        }
        if(left - right > 1 || right - left > 1){
            return -1;
        }
        else{
            return left > right ? left + 1: right + 1;
        }
    }
}