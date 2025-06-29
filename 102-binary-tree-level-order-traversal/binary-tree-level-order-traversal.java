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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if(root == null){
            return result;
        }
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);

        List<Integer> currentLevel = new ArrayList<>();

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode == null){
                result.add(currentLevel);
                currentLevel = new ArrayList<>();

                if(!queue.isEmpty()){
                    queue.offer(null);
                }
            }else{
                currentLevel.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }
}