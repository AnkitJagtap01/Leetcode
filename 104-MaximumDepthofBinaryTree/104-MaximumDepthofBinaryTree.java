public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // Base case: if the tree is empty, the depth is 0.
        }
        // Recursive case: calculate the depth of the left and right subtrees.
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        // The depth of the tree is the max of the depths of the subtrees plus one for the root.
 */
 * }
 *     }
 *         this.right = right;
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

[
