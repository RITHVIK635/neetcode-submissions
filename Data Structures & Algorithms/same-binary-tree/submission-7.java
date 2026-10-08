/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p== null && q == null){
            return true;
        }
        if( p ==null || q == null){
            return false ;
        }
        int left = val(p);
        int right=val(q);
        if(left!=right){
    return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public int val(TreeNode node){
        return node.val;
    }
}
