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

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;  // Start with depth 1 since we are counting from the root node
        
        while (!queue.isEmpty()) {
            int size = queue.size();  // Number of nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                
                // Check if the current node is a leaf node
                if (current.left == null && current.right == null) {
                    return depth;  // Return the depth when the first leaf is encountered
                }
                
                // Add children to the queue
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            depth++;  // Increment depth as we move to the next level
        }
        
        return depth;
    }
}
