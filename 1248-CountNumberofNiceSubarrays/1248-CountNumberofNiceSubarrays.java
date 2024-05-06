        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {  // nums[j] is odd
                k--;
            }
            // When k is less than zero, it means there are more than 'k' odd numbers
            while (k < 0) {
                if (nums[i] % 2 != 0) {
                    k++;
        int res = 0;  // result to store number of valid subarrays

        int count = 0;
        int i = 0;  // start of the sliding window
    }
    
    // Helper function to count subarrays with at most k odd numbers
    private int atMostK(int[] nums, int k) {
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
[
