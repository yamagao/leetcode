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
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        List<Integer> result = new LinkedList<Integer>();
        if(root == null){
            return result;
        }
        stack.push(root);
        TreeNode cur;
        while(!stack.isEmpty()){
            cur = stack.pop();
            if(cur.left == null && cur.right == null){
                result.add(cur.val);
                continue;
            }
            if(cur.right != null){
                stack.push(cur.right);
                cur.right = null;
            }
            stack.push(cur);
            if(cur.left != null){
                stack.push(cur.left);
                cur.left = null;
            }
        }
        return result;
    }
}