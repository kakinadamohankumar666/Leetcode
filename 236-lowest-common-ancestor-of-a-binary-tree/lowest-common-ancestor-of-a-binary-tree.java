/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean getPath(TreeNode root, TreeNode target, List<TreeNode> path){
        if (root == null) return false;

        path.add(root);
        if(root == target) return true;

        if(getPath(root.left, target,path) || getPath(root.right,target,path))
        return true;

        path.remove(path.size() -1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        getPath(root, p, pathP);
        getPath(root, q, pathQ);

        int i =0;
        while(i<pathP.size() && i<pathQ.size() && pathP.get(i) == pathQ.get(i)){
            i++;
        }

        return pathP.get(i-1);
    }
}