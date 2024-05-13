class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();
        
        // The next number we need to see to continue without a gap
        long next = lower; // Use long to avoid overflow

        for (int num : nums) {
            // If the current number is less than the next needed number, skip it
            if (num < next) continue;

            // If there's a gap between the next needed number and the current number
            if (num > next) {
                result.add(List.of((int)next, num - 1));
            }
            // Move next to the next number after the current number
            next = (long)num + 1;
        }

        // Check if there's a gap between the last number and upper
        if (next <= upper) {
            result.add(List.of((int)next, upper));
        }

        return result;
    }
}
