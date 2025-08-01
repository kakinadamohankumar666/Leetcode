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
    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        reverseinorder(root);
        return root;
    }
    private void reverseinorder(TreeNode node){
        if (node == null) return;
        reverseinorder(node.right);

        sum += node.val;
        node.val = sum;
        reverseinorder(node.left);
    }
}