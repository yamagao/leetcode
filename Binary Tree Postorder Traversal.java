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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null){
            return result;
        }
        stack.push(root);
        TreeNode top;
        TreeNode left;
        TreeNode right;
        while(!stack.isEmpty()){
            top = stack.pop();
            if(top.left == null && top.right == null){
                result.add(top.val);
            }
            else{
                left = top.left;
                right = top.right;
                top.left = null;
                top.right = null;
                stack.push(top);
                if(right != null){
                    stack.push(right);
                }
                if(left != null){
                    stack.push(left);
                }
            }
        }
        return result;
    }
}