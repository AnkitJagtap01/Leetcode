class Solution {
    private int maxLength = 0;

    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0, root.val);
        return maxLength;
    }

    private void dfs(TreeNode node, int currentLength, int expectedValue) {
        if (node == null) return;

        // If the node value is the expected one, increment the current length
        if (node.val == expectedValue) {
            currentLength++;
        } else {
            // Reset current length if the sequence breaks
            currentLength = 1;
        }

        // Update the maximum length found so far
        maxLength = Math.max(maxLength, currentLength);

        // Recursively call dfs for the left and right child
        dfs(node.left, currentLength, node.val + 1);
        dfs(node.right, currentLength, node.val + 1);
    }
}

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
