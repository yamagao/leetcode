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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return result;
        }
        helper(result, 0, root);
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < result.size(); i++){
            temp.add(result.get(result.size() - i - 1));
        }
        return temp;
    }
    
    void helper(ArrayList<ArrayList<Integer>> result, int level, TreeNode root){
        if(root == null){
            return;
        }
        ArrayList<Integer> list;
        if(level >= result.size()){
            list = new ArrayList<Integer>();
            list.add(root.val);
            result.add(level, list);
        }
        else{
            list = result.get(level);
            list.add(root.val);
        }
        helper(result, level + 1, root.left);
        helper(result, level + 1, root.right);
    }
}