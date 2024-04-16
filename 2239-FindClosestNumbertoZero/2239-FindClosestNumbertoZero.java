public class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0]; // Start with the first element as the closest
        
        for (int num : nums) {
            // If the absolute value of the current number is less than the absolute
            // value of the closest or they are equal but the current number is greater
            if (Math.abs(num) < Math.abs(closest) || (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num; // Update the closest number
            }
        }
        
        return closest; // Return the closest number to zero
    }
}

[-4,-2,1,4,8]
