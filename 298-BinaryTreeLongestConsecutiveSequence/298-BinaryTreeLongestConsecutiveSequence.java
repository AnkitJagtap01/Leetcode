        }
        } else {
            // Reset current length if the sequence breaks
            currentLength = 1;

        // If the node value is the expected one, increment the current length
        if (node.val == expectedValue) {
            currentLength++;

    private void dfs(TreeNode node, int currentLength, int expectedValue) {
        if (node == null) return;
        dfs(root, 0, root.val);
        return maxLength;
    }

    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
class Solution {
    private int maxLength = 0;
[
