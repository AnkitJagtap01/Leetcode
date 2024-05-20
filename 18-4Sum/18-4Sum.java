// Time: O(n^3)
// Space: O(1)
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums); // Sort the array

        int n = nums.length;
        for (int i = 0; i < n - 3; i++) { // First number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate numbers
            }
            for (int j = i + 1; j < n - 2; j++) { // Second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicate numbers
                }

                int left = j + 1;
                int right = n - 1;
                while (left < right) { // Two-pointer technique
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right]; // Use long to prevent overflow
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates
                        while (left < right && nums[right] == nums[right - 1]) right--; // Skip duplicates
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
