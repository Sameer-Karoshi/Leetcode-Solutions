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
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Inorder(root1);
        Inorder(root2);
        Collections.sort(list);
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
