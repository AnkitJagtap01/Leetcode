 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // If the root is null, there is no path to check
        if (root == null) return false;

        // Check if we are at a leaf node
        if (root.left == null && root.right == null) {
            // Check if the path sum equals the target sum
            return root.val == targetSum;
        }

        // Recursively check the left and right subtrees with the updated target sum
        return hasPathSum(root.left, targetSum - root.val) 
            || hasPathSum(root.right, targetSum - root.val);
    }
}
class Solution {

[
