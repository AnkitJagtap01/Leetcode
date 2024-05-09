        
        // Use the helper function to check if the tree is balanced and calculate height
        return height(root) != -1;
    }
    
    private int height(TreeNode node) {
        if (root == null) return true;
        // A null tree is balanced
    public boolean isBalanced(TreeNode root) {
class Solution {

 */
 * }
 *     }
 *         this.right = right;
 *         this.left = left;
 *         this.val = val;
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode() {}
 *     TreeNode right;
        // Base case: an empty subtree is balanced and has height -1
        if (node == null) return 0;
        
        // Recursively find the height of the left subtree
        int leftHeight = height(node.left);
[
