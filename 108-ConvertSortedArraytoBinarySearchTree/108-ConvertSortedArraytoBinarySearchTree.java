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
    public TreeNode sortedArrayToBST(int[] nums) {
        // Start the recursive function to convert the array to a BST
        return convertToBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode convertToBST(int[] nums, int left, int right) {
        if (left > right) {
            // If the left index exceeds the right, return null (base case)
            return null;
        }
        
        // Find the middle element to maintain the height balance
        int mid = left + (right - left) / 2;
        
        // Create a new node with the middle element
        TreeNode node = new TreeNode(nums[mid]);
        
        // Recursively build the left and right subtrees
        node.left = convertToBST(nums, left, mid - 1);
        node.right = convertToBST(nums, mid + 1, right);
        
        return node;
    }
}
