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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return result;
        }
        ArrayList<Integer> temp;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 1;
        int nextC = 0;
        TreeNode cur;
        while(!queue.isEmpty()){
            temp = new ArrayList<Integer>();
            while(count > 0){
                cur = queue.pop();
                count--;
                temp.add(cur.val);
                if(cur.left != null){
                    queue.add(cur.left);
                    nextC++;
                }
                if(cur.right != null){
                    queue.add(cur.right);
                    nextC++;
                }
            }
            result.add(temp);
            count = nextC;
            nextC = 0;
        }
        return result;
    }
}