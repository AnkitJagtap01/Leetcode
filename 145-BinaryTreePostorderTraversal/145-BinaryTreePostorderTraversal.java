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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        Stack<Boolean> visited = new Stack<>();
        
        stack.push(root);
        visited.push(false);
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            boolean isVisited = visited.pop();
            
            if (node == null) {
                continue;
            }
            
            if (isVisited) {
                result.add(node.val);
            } else {
                stack.push(node);
                visited.push(true);
                
                if (node.right != null) {
                    stack.push(node.right);
                    visited.push(false);
                }
                
                if (node.left != null) {
                    stack.push(node.left);
                    visited.push(false);
                }
            }
        }
        
        return result;
    }
}
