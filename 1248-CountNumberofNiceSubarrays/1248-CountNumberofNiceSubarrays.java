class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    
    // Helper function to count subarrays with at most k odd numbers
    private int atMostK(int[] nums, int k) {
        int count = 0;
        int i = 0;  // start of the sliding window
        int res = 0;  // result to store number of valid subarrays

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {  // nums[j] is odd
                k--;
            }
            // When k is less than zero, it means there are more than 'k' odd numbers
            while (k < 0) {
                if (nums[i] % 2 != 0) {
                    k++;
                }
                i++;
            }
            // Count the subarrays ending at j
            res += j - i + 1;
        }

        return res;
    }
}
