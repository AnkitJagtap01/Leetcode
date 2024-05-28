class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];  // The first element is the same in both arrays

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];  // Each element is the sum of the previous elements
        }

        return result;
    }
}
