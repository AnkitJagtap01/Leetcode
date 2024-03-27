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
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    private int count = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return count;
    }
    
    // Returns an array of two integers: [sum of subtree, node count of subtree]
    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        
        int sum = left[0] + right[0] + node.val;
        int nodes = left[1] + right[1] + 1;
        
        // Check if the current node's value equals the average of its subtree
        if (node.val == sum / nodes) {
            count++;
        }
        
        return new int[]{sum, nodes};
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(6);

        Solution solution = new Solution();
        System.out.println(solution.averageOfSubtree(root)); // Output: 5
    }
}

