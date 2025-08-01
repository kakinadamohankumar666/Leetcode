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
    private Integer prev = null;
    private int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff; 
    }
     private void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);

        if(prev != null){
            int diff = node.val - prev;

            minDiff = Math.min(minDiff,diff);
        }

        prev = node.val;

        inorder(node.right);
    }
}