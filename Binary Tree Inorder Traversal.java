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
    public List<Integer> list = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
       Inorder(root);
       return list;
    }
    
    public void Inorder(TreeNode node){
        if(node == null){
            return;
        }
        Inorder(node.left);
        list.add(node.val);
        Inorder(node.right);
    }
}