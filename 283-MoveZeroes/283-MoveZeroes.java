        int insertPos = 0;
        // Move all non-zero values to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        // Fill remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}

    public void moveZeroes(int[] nums) {
public class Solution {
[
