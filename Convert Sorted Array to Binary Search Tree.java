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
    public TreeNode sortedArrayToBST(int[] num) {
        return rootNode(num, 0, num.length - 1);
    }
    
    TreeNode rootNode(int[] num, int start, int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return new TreeNode(num[start]);
        }
        int mid = (start + end) / 2;
        TreeNode result = new TreeNode(num[mid]);
        result.left = rootNode(num, start, mid - 1);
        result.right = rootNode(num, mid + 1, end);
        return result;
    }
}