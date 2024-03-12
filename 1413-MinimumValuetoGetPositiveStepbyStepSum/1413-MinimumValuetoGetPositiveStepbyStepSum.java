class Solution {
    public int minStartValue(int[] nums) {
        int minPrefixSum = 0; // Track the minimum prefix sum
        int prefixSum = 0; // Current prefix sum
        
        for (int num : nums) {
            prefixSum += num; // Update prefix sum
            minPrefixSum = Math.min(minPrefixSum, prefixSum); // Update minimum prefix sum
        }
        
        // Calculate and return the minimum start value
        // If minPrefixSum is negative, we need to offset it to start from 1
        // Otherwise, the start value is 1
        return 1 - minPrefixSum;
    }
}

[-3,2,-3,4,2]
