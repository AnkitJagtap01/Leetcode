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
        // A null tree is balanced
        if (root == null) return true;
        
        // Use the helper function to check if the tree is balanced and calculate height
        return height(root) != -1;
    }
    
    private int height(TreeNode node) {
        // Base case: an empty subtree is balanced and has height -1
        if (node == null) return 0;
        
        // Recursively find the height of the left subtree
        int leftHeight = height(node.left);
        if (leftHeight == -1) return -1; // Left subtree is not balanced
        
        // Recursively find the height of the right subtree
        int rightHeight = height(node.right);
        if (rightHeight == -1) return -1; // Right subtree is not balanced
        
        // If the current node is unbalanced, return -1
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        
        // Otherwise, return the height of the tree rooted at this node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
