class Solution {
    public int maxProductDifference(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    // Two largest numbers: nums[n-1], nums[n-2]
    // Two smallest numbers: nums[0], nums[1]
    int productDifference = (nums[n-1] * nums[n-2]) - (nums[0] * nums[1]);
    return productDifference;
}
}

[
