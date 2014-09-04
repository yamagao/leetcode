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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else{
            if(p == null || q == null){
                return false;
            }
        }
        LinkedList<TreeNode> pQueue = new LinkedList<TreeNode>();
        LinkedList<TreeNode> qQueue = new LinkedList<TreeNode>();
        pQueue.add(p);
        qQueue.add(q);
        TreeNode pCur;
        TreeNode qCur;
        while(!pQueue.isEmpty() && !qQueue.isEmpty()){
            pCur = pQueue.remove();
            qCur = qQueue.remove();
            if(pCur.val != qCur.val){
                return false;
            }
            if(pCur.left != null && qCur.left != null){
                pQueue.add(pCur.left);
                qQueue.add(qCur.left);
            }
            else{
                if((pCur.left != null && qCur.left == null) || (pCur.left == null && qCur.left != null)){
                    return false;
                }
            }
            if(pCur.right != null && qCur.right != null){
                pQueue.add(pCur.right);
                qQueue.add(qCur.right);
            }
            else{
                if((pCur.right != null && qCur.right == null) || (pCur.right == null && qCur.right != null)){
                    return false;
                }
            }
        }
        return true;
    }
}