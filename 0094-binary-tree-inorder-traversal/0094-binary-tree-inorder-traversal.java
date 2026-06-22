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
    public void inordeRecursive(TreeNode curr,List<Integer> node){
        if(curr == null){
            return;
        }
        inordeRecursive(curr.left,node);
        node.add(curr.val);
        inordeRecursive(curr.right,node);


    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> node = new ArrayList<>();
        inordeRecursive(root, node);

        return node;
        
    }
}