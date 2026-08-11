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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res= new int[1];
        height(root,res);
        return res[0];
    }
    
     private int height(TreeNode node, int[] res ){
        if (node==null){
            return 0 ;
        } 
        int left=height(node.left,res);
        int right=height(node.right,res);
        int current= left+right;
        res[0]=Math.max(res[0],current);
        return 1+Math.max(left,right);
    }
    }


