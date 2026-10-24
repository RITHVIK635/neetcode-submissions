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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorder= new LinkedList<>();
        helper(root,inorder);
        boolean bst=true;
        int prev = inorder.get(0);
        for(int i =1;i<inorder.size();i++){
            if(inorder.get(i)<=prev){
                bst=false;
            }
            prev=inorder.get(i);
        }
        return bst;
    
    }
    
    void helper ( TreeNode node ,List<Integer> inorder){
        if(node == null){
            return ;
        }
        helper(node.left,inorder);
        inorder.add(node.val);
        helper(node.right,inorder);

    }
}
