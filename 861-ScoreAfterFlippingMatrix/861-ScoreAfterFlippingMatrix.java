            // Move next to the next number after the current number
            next = (long)num + 1;
        }

            }
            if (num > next) {
                result.add(List.of((int)next, num - 1));
            // If there's a gap between the next needed number and the current number
            if (num < next) continue;

            // If the current number is less than the next needed number, skip it

        for (int num : nums) {
        
        // The next number we need to see to continue without a gap
        long next = lower; // Use long to avoid overflow
        // Check if there's a gap between the last number and upper
        if (next <= upper) {
            result.add(List.of((int)next, upper));
        List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
class Solution {
        }

        return result;
[
