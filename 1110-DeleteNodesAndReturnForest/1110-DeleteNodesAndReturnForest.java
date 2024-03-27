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
    private Set<Integer> toDeleteSet;
    private List<TreeNode> forest;
    
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        toDeleteSet = new HashSet<>();
        for (int val : to_delete) toDeleteSet.add(val);
        
        forest = new ArrayList<>();
        root = dfs(root, null);
        if (root != null) forest.add(root); // Add the remaining tree's root if it's not null
        return forest;
    }
    
    private TreeNode dfs(TreeNode node, TreeNode parent) {
        if (node == null) return null;
        
        // Recursive DFS
        node.left = dfs(node.left, node);
        node.right = dfs(node.right, node);
        
        if (toDeleteSet.contains(node.val)) {
            // If the node needs to be deleted, check if it's children could be new roots
            if (node.left != null) forest.add(node.left);
            if (node.right != null) forest.add(node.right);
            return null; // Return null to parent, effectively "deleting" this node
        }
        
        return node; // Return the unchanged node if it doesn't need to be deleted
    }
}
