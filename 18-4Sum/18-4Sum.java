            for (int j = i + 1; j < n - 2; j++) { // Second number

        Arrays.sort(nums); // Sort the array

        int n = nums.length;
        for (int i = 0; i < n - 3; i++) { // First number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate numbers
            }
// Space: O(1)
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
// Time: O(n^3)
[
