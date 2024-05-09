/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Start the recursive function to convert the array to a BST
        return convertToBST(nums, 0, nums.length - 1);
    }
    
    private TreeNode convertToBST(int[] nums, int left, int right) {
        if (left > right) {
            // If the left index exceeds the right, return null (base case)
[-10,-3,0,5,9]
