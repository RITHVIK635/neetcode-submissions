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
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        int left=height(root.left); // first call
        int right=height(root.right); // afterwards right call
        if(Math.abs(left-right)>1) return false ;
        return isBalanced(root.left) && isBalanced(root.right); // why this line
    }
    public int height(TreeNode root){ // it will be called
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right)); // root.left.left will be called now
    }
        
    }

