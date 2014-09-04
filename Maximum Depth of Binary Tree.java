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
    public int maxDepth(TreeNode root) {
        if(root ==  null){
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        LinkedList<Integer> depth = new LinkedList<Integer>();
        queue.add(root);
        depth.add(1);
        TreeNode cur;
        int dep;
        int result = 0;
        while(!queue.isEmpty()){
            cur = queue.remove();
            dep = depth.remove();
            if(dep > result){
                result = dep;
            }
            if(cur.left != null){
                queue.add(cur.left);
                depth.add(dep + 1);
            }
            if(cur.right != null){
                queue.add(cur.right);
                depth.add(dep + 1);
            }
        }
        return result;
    }
}